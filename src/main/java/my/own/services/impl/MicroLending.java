package my.own.services.impl;

import my.own.services.LendingRiskAnalysis;
import my.own.services.MicroLendingService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MicroLending implements MicroLendingService {

	Logger logger = LoggerFactory.getLogger(MicroLending.class);
	
	@Autowired
	private LendingRiskAnalysis riskAnalyzer;
	
	@Override
	public void applyForLoan() {
		logger.debug("Applied for loan");
		riskAnalyzer.verifyRisk();
	}

	@Override
	public void extendLoan() {
		logger.debug("Requested loan extension");
	}
}
