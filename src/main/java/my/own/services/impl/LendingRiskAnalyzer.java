package my.own.services.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import my.own.services.LendingRiskAnalysis;

public class LendingRiskAnalyzer implements LendingRiskAnalysis {

	Logger logger = LoggerFactory.getLogger(LendingRiskAnalyzer.class);
	
	@Override
	public Boolean verifyRisk() {
		logger.debug("Started risk verification");
		return Boolean.TRUE;
	}
}
