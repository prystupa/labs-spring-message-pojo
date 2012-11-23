package com.prystupa;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: eprystupa
 * Date: 11/22/12
 * Time: 7:21 PM
 */
@XmlRootElement
public class LoanEligibilityRequest {

    private String loanId;

    public LoanEligibilityRequest() {

    }

    public LoanEligibilityRequest(String loanId) {
        this.loanId = loanId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }
}
