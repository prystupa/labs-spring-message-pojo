package com.prystupa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: eprystupa
 * Date: 11/21/12
 * Time: 5:12 PM
 */
public class LoanEligibilityCheckController {

    private final Logger logger = LoggerFactory.getLogger(LoanEligibilityCheckController.class);

    public LoanEligibilityResponse checkLoan(final LoanEligibilityRequest request) throws InterruptedException {

        final String loanId = request.getLoanId();
        final String result = loanId + " is good enough";

        logger.info(result);
        Thread.sleep(5000);
        return new LoanEligibilityResponse(result);
    }

    public LoanEligibilityResponse checkLoan2(final LoanEligibilityRequest request) throws InterruptedException {

        final String loanId = request.getLoanId();
        final String result = loanId + " is good enough 2";

        logger.info(result);
        Thread.sleep(5000);
        return new LoanEligibilityResponse(result);
    }
}
