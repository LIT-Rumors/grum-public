//package at.jku.lit.grum.extensions.esper;
//
//import com.espertech.esper.client.EventBean;
//import com.espertech.esper.client.UpdateListener;
//import com.espertech.esper.event.map.MapEventBean;
//
//public class GPSHealthSetter implements UpdateListener {
//
//	@Override
//	public void update(EventBean[] newData, EventBean[] oldEvents) {
//		
//
//		EventBean event = newData[0];
//		Object eve = event.getUnderlying();
//		if (event instanceof MapEventBean) {
//			System.out.println(event);
//		
//		}
//		//MonitoringMiddleware.getInstance().setGPSHealth("VIRT1", "ERROR");
//	}
//
//}
