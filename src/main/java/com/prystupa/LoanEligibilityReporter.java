package com.prystupa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: eprystupa
 * Date: 11/21/12
 * Time: 5:44 PM
 */
public class LoanEligibilityReporter {

    private static Logger logger = LoggerFactory.getLogger(LoanEligibilityReporter.class);

    public void report(final LoanEligibilityResponse response) {
        final String results = response.getResponse();
        logger.info(results);
    }
}
