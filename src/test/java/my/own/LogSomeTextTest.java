package my.own;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
    Initial sample test
 */
public class LogSomeTextTest {

    @Test
    public void logSomeText () {
        Logger logger = LoggerFactory.getLogger(LogSomeTextTest.class);
        logger.debug("This is some DEBUG message");
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);
    }
}
