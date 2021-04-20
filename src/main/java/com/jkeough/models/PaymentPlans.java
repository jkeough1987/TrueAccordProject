package com.jkeough.models;

import java.util.ArrayList;

public class PaymentPlans {
    private ArrayList<PaymentPlan> paymentPlans;

    public PaymentPlans() {
    }

    public void setPaymentPlans(ArrayList<PaymentPlan> paymentPlans) {
        this.paymentPlans = paymentPlans;
    }

    public ArrayList<PaymentPlan> getPaymentPlans() {
        return paymentPlans;
    }

    @Override
    public String toString() {
        return "PaymentPlans{" +
                "paymentPlans=" + paymentPlans +
                '}';
    }
}
