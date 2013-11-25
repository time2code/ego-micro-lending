package my.own.config;

import my.own.services.LendingRiskAnalysis;
import my.own.services.MicroLendingService;
import my.own.services.impl.LendingRiskAnalyzer;
import my.own.services.impl.MicroLending;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppSpringConfig {

	@Bean
	public MicroLendingService microLendingService() {
		return new MicroLending();
	}
	
	@Bean
	public LendingRiskAnalysis riskAnalyzer() {
		return new LendingRiskAnalyzer();
	}
}
