package com.jkeough.models;

import java.util.ArrayList;

public class Debts {
    private ArrayList<Debt> debts;

    public Debts() {
    }

    public void setDebts(ArrayList<Debt> debts) {
        this.debts = debts;
    }

    public ArrayList<Debt> getDebts() {
        return debts;
    }

    @Override
    public String toString() {
        return "Debts{" +
                "debts=" + debts +
                '}';
    }
}
