package my.own;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import my.own.config.AppSpringConfig;
import my.own.services.LendingRiskAnalysis;
import my.own.services.MicroLendingService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.util.Assert;

/**
    Spring context test
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppSpringConfig.class, loader=AnnotationConfigContextLoader.class)
public class SpringContextTest {

	@Autowired
	private MicroLendingService lendingService;
	
	@Autowired
	private LendingRiskAnalysis riskAnalyzer;
	
    @Test
    public void loadSpringContext () {
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);
        Logger logger = LoggerFactory.getLogger(SpringContextTest.class);
        logger.debug("Some debug message");
        Assert.notNull(lendingService);
        Assert.notNull(riskAnalyzer);
        lendingService.applyForLoan();
    }
}
