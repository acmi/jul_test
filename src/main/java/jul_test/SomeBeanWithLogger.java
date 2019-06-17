package jul_test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SomeBeanWithLogger {

    private static Log log = LogFactory.getLog(SomeBeanWithLogger.class);

    public SomeBeanWithLogger() {
        log.info("logger" + (log.isTraceEnabled() ? " " : " NOT ") + "configured!");
    }

}
