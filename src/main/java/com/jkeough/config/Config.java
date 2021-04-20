package com.jkeough.config;

import com.jkeough.models.Debt;

import java.util.ArrayList;

public class Config {
    private static String debtsURL;
    private static String paymentsURL;
    private static String paymentPlansURL;

    public Config() {
    }

    public static String getDebtsURL() {
        if(debtsURL == null) {
            debtsURL = "https://my-json-server.typicode.com/druska/trueaccord-mock-payments-api/debts";
        }
        return debtsURL;
    }

    public static String getPaymentsURL() {
        if(paymentsURL == null) {
            paymentsURL = "https://my-json-server.typicode.com/druska/trueaccord-mock-payments-api/payments";
        }
        return paymentsURL;
    }

    public static String getPaymentPlansURL() {
        if(paymentPlansURL == null){
            paymentPlansURL = "https://my-json-server.typicode.com/druska/trueaccord-mock-payments-api/payment_plans";
        }
        return paymentPlansURL;
    }
}
