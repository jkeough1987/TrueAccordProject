package com.jkeough.models;

import java.util.ArrayList;

public class Payments {
    private ArrayList<Payment> payments;

    public Payments() {
    }

    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    @Override
    public String toString() {
        return "Payments{" +
                "payments=" + payments +
                '}';
    }
}
