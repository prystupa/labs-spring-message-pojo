package com.prystupa;

/**
 * Created with IntelliJ IDEA.
 * User: eprystupa
 * Date: 11/21/12
 * Time: 5:44 PM
 */
public class LoanEligibilityReporter {

    public void report(final LoanEligibilityResponse response) {
        final String results = response.getResponse();
        System.out.println("Eligibility results: " + results);
    }
}
