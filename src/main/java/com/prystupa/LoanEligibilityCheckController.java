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

    public LoanEligibilityResponse checkLoan(final LoanEligibilityRequest request) {

        final String loanId = request.getLoanId();
        final String result = loanId + " is good enough";

        logger.info(result);
        return new LoanEligibilityResponse(result);
    }
}
