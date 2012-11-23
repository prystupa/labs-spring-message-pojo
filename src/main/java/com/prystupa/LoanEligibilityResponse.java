package com.prystupa;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: eprystupa
 * Date: 11/22/12
 * Time: 7:29 PM
 */
@XmlRootElement
public class LoanEligibilityResponse {
    private String response;

    public LoanEligibilityResponse() {
    }

    public LoanEligibilityResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
