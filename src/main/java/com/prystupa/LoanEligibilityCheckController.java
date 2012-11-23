package com.prystupa;

/**
 * Created with IntelliJ IDEA.
 * User: eprystupa
 * Date: 11/21/12
 * Time: 5:12 PM
 */
public class LoanEligibilityCheckController {

    public LoanEligibilityResponse checkLoan(final LoanEligibilityRequest request) {

        final String loanId = request.getLoanId();
        final String result = loanId + " is good enough";

        System.out.println(result);
        return new LoanEligibilityResponse(result);
    }
}
