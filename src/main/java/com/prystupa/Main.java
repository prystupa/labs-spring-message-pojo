package com.prystupa;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: eugene.prystupa
 * Date: 30.11.11
 * Time: 17:20
 */
public class Main {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "classpath:/META-INF/application-context-root.xml");

        System.out.println("Enter loan ID to check eligibility");
        Scanner scanner = new Scanner(System.in);
        String loanId;

        do {
            loanId = scanner.nextLine();

            JmsTemplate publisher = ctx.getBean("publisher", JmsTemplate.class);
            publisher.convertAndSend(new LoanEligibilityRequest(loanId));
        } while (!loanId.equals(""));
    }
}
