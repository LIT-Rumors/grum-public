package at.jku.se.mosumo.tools.logging;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.pattern.ConverterKeys;
import org.apache.logging.log4j.core.pattern.LogEventPatternConverter;
/**
 * @author Michael Vierhauser
 */
@Plugin(name="LineConverter", category = "Converter")
@ConverterKeys({"b"})
public class LocationConverter extends LogEventPatternConverter{
    protected LocationConverter(String name, String style) {
        super(name, style);
    }

    public static LocationConverter newInstance(String[] options) {
        return new LocationConverter("b","b");
    }

    @Override
    public void format(LogEvent event, StringBuilder toAppendTo) {
        toAppendTo.append(getReqId());

      
    }

    protected String getReqId() {
        return "xxx";
    }
}