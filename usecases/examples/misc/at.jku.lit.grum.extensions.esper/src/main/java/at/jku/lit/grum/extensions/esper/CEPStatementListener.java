package at.jku.lit.grum.extensions.esper;

import java.util.Map.Entry;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;
import com.espertech.esper.event.bean.BeanEventBean;
import com.espertech.esper.event.map.MapEventBean;

import at.jku.lit.grum.dronology.model.dronology.IdableElement;
import at.jku.se.mosumo.tools.logging.ILogger;
import at.jku.se.mosumo.tools.logging.LoggerProvider;
import middleware.MonitoringMiddleware;
import validation.IConstraint;
import validation.IViolation;
import validation.ValidationFactory;

public class CEPStatementListener implements UpdateListener {

	private static final ILogger LOGGER = LoggerProvider.getLogger(CEPStatementListener.class);
	private IConstraint constraint;

	public CEPStatementListener(IConstraint constraint) {
		this.constraint = constraint;
	}

	@Override
	public void update(EventBean[] newData, EventBean[] oldData) {
		try {

			EventBean event = newData[0];
			Object eve = event.getUnderlying();
			if (event instanceof MapEventBean) {
				MapEventBean ev = (MapEventBean) event;
				System.out.println(ev.getProperties());
				IdableElement idevent = null;
				for (Entry<String, Object> p : ev.getProperties().entrySet()) {

					if (p.getValue() instanceof BeanEventBean) {
						idevent = (IdableElement) ((BeanEventBean) p.getValue()).getUnderlying();
						break;
					}
					idevent = (IdableElement) p.getValue();
					break;
				}
				IViolation violation = ValidationFactory.createViolation(idevent != null ? idevent.getId() : "null",
						constraint, ev.getUnderlying());
				MonitoringMiddleware.getInstance().sendViolation(violation);

			} else if (event instanceof EventBean) {
				IViolation violation = ValidationFactory.createViolation(
						((IdableElement) event.getUnderlying()).getId(), constraint, event.getUnderlying());
				MonitoringMiddleware.getInstance().sendViolation(violation);
			}

			else {
				LOGGER.error("not handled:" + event.getClass());
			}
		} catch (Throwable t) {
			LOGGER.error(t);
		}
	}

}
