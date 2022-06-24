package measure;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.RuntimeMXBean;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import at.jku.se.mosumo.monitoring.util.FormatUtil;
import at.jku.se.mosumo.monitoring.util.Pair;

public class TimingWriter {

	public static String EVAL_FOLDER = "/home/rumors/icseeval/logs";
	private static Timer timer = new Timer(true);
	private static AtomicInteger CHECK_COUNTER = new AtomicInteger(0);

	private static final String EVENTS_TIMING = "ti_events.txt";
	static final String CONSTRAINT_TIMING = "ti_cst.txt";
	static final String VIOLATION_TIMING = "ti_viol.txt";
	static final String CONSTRAINT_COUNT = "count_cst.txt";
	
	private static final String JVM_DATA = "jvm_stats.txt";

	static {

		try {
			String extPath = System.getProperty("evalpath");
			if(extPath!=null) {
				EVAL_FOLDER = extPath;
			}
			System.out.println("LOG FOLDER IS:"+EVAL_FOLDER);
			
			Paths.get(EVAL_FOLDER, EVENTS_TIMING).toFile().createNewFile();
			Paths.get(EVAL_FOLDER, CONSTRAINT_TIMING).toFile().createNewFile();
			Paths.get(EVAL_FOLDER, VIOLATION_TIMING).toFile().createNewFile();
			Paths.get(EVAL_FOLDER, CONSTRAINT_COUNT).toFile().createNewFile();
			Paths.get(EVAL_FOLDER, JVM_DATA).toFile().createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		timer.scheduleAtFixedRate(new WriteTask(), 0l, (30 * 1000));
		timer.scheduleAtFixedRate(new JVMTask(), 0l, (10 * 1000));
	}

	private static LinkedBlockingQueue<Pair> values = new LinkedBlockingQueue<>();
	private static LinkedBlockingQueue<Pair> cvalues = new LinkedBlockingQueue<>();
	private static LinkedBlockingQueue<Pair> violvalues = new LinkedBlockingQueue<>();

	public static void submitMessage(String topic, long finished) {
		values.add(Pair.create(topic, finished));

	}

	private static void measureJVM() {
		com.sun.management.OperatingSystemMXBean operatingSystemMXBean = (com.sun.management.OperatingSystemMXBean) ManagementFactory
				.getOperatingSystemMXBean();
		// RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();

		double cpuLoad = operatingSystemMXBean.getProcessCpuLoad();
		MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();

//		    System.out.println(String.format("Used heap memory: %.2f GB", 
//		      (double)memoryMXBean.getHeapMemoryUsage().getUsed() /1073741824));
		long mem = memoryMXBean.getHeapMemoryUsage().getUsed();
		String s = FormatUtil.formatTimestamp(System.currentTimeMillis()) + "," + cpuLoad + "," + mem;
		try {
			Files.write(Paths.get(EVAL_FOLDER, JVM_DATA), Collections.singleton(s), Charset.defaultCharset(),
					StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected static void writeValues() {
		ArrayList<Pair> toWrite = new ArrayList<>();
		ArrayList<Pair> toWrite2 = new ArrayList<>();
		ArrayList<Pair> toWrite3 = new ArrayList<>();
		synchronized (values) {
			values.drainTo(toWrite);
		}
		synchronized (cvalues) {
			cvalues.drainTo(toWrite2);
		}
		synchronized (violvalues) {
			violvalues.drainTo(toWrite3);
		}
		// Files.write(Paths.get("/home/michael/timing.txt"), values,
		// StandardOpenOption.APPEND);
		try {
			List<String> strings = toWrite.stream().map(op -> op.getFirst()+","+op.getSecond().toString()).collect(Collectors.toList());
			Files.write(Paths.get(EVAL_FOLDER, EVENTS_TIMING), strings, Charset.defaultCharset(),
					StandardOpenOption.APPEND);

			List<String> strings2 = toWrite2.stream().map(op -> op.getFirst()+","+op.getSecond().toString()).collect(Collectors.toList());
			Files.write(Paths.get(EVAL_FOLDER, CONSTRAINT_TIMING), strings2, Charset.defaultCharset(),
					StandardOpenOption.APPEND);
			
			List<String> strings3 = toWrite3.stream().map(op -> op.getFirst()+","+op.getSecond().toString()).collect(Collectors.toList());
			Files.write(Paths.get(EVAL_FOLDER, VIOLATION_TIMING), strings3, Charset.defaultCharset(),
					StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static class WriteTask extends TimerTask {

		@Override
		public void run() {
			// System.out.println("WRITE VALUES");
			writeValues();
			writeConstraintCount();

		}
	}

	static class JVMTask extends TimerTask {

		@Override
		public void run() {
			measureJVM();

		}
	}

	public static void submitConstraintCheck(String topic, long timeDifference) {
		synchronized (cvalues) {
			cvalues.add(Pair.create(topic, timeDifference));
		}
	}

	public static void writeConstraintCount() {
		int count = CHECK_COUNTER.intValue();
		List<String> strings = new ArrayList();
		strings.add(FormatUtil.formatTimestamp(System.currentTimeMillis()) + "--" + count);
		try {
			Files.write(Paths.get(EVAL_FOLDER, CONSTRAINT_COUNT), strings, Charset.defaultCharset(),
					StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static synchronized void increaseCheckCount() {
		CHECK_COUNTER.getAndIncrement();

	}

	public static void submitViolation(String topic, long timeDifference) {
		synchronized (cvalues) {
			violvalues.add(Pair.create(FormatUtil.formatTimestamp(System.currentTimeMillis())+","+topic, timeDifference));
		}
		
	}

}
