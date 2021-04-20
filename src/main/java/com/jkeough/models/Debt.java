package com.jkeough.models;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "amount",
        "Payments",
        "PaymentPlan",
        "is_in_payment_plan",
        "remaining_amount",
        "next_payment_due_date"
})
@Generated("jsonschema2pojo")
public class Debt implements Serializable
{

    @JsonProperty("id")
    private int id;
    @JsonProperty("amount")
    private double amount;
    @JsonProperty("Payments")
    private List<Payment> payments = null;
    @JsonProperty("PaymentPlan")
    private PaymentPlan paymentPlan;
    @JsonProperty("is_in_payment_plan")
    private boolean isInPaymentPlan;
    @JsonProperty("remaining_amount")
    private double remainingAmount;
    @JsonProperty("next_payment_due_date")
    private String nextPaymentDueDate;
    private final static long serialVersionUID = -6012968397780947013L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Debt() {
    }

    /**
     *
     * @param remainingAmount
     * @param amount
     * @param paymentPlan
     * @param payments
     * @param isInPaymentPlan
     * @param id
     * @param nextPaymentDueDate
     */
    public Debt(int id, double amount, List<Payment> payments, PaymentPlan paymentPlan, boolean isInPaymentPlan, double remainingAmount, String nextPaymentDueDate) {
        super();
        this.id = id;
        this.amount = amount;
        this.payments = payments;
        this.paymentPlan = paymentPlan;
        this.isInPaymentPlan = isInPaymentPlan;
        this.remainingAmount = remainingAmount;
        this.nextPaymentDueDate = nextPaymentDueDate;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("amount")
    public double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @JsonProperty("Payments")
    public List<Payment> getPayments() {
        return payments;
    }

    @JsonProperty("Payments")
    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    @JsonProperty("PaymentPlan")
    public PaymentPlan getPaymentPlan() {
        return paymentPlan;
    }

    @JsonProperty("PaymentPlan")
    public void setPaymentPlan(PaymentPlan paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    @JsonProperty("is_in_payment_plan")
    public boolean isIsInPaymentPlan() {
        return isInPaymentPlan;
    }

    @JsonProperty("is_in_payment_plan")
    public void setIsInPaymentPlan(boolean isInPaymentPlan) {
        this.isInPaymentPlan = isInPaymentPlan;
    }

    @JsonProperty("remaining_amount")
    public double getRemainingAmount() {
        return remainingAmount;
    }

    @JsonProperty("remaining_amount")
    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    @JsonProperty("next_payment_due_date")
    public String getNextPaymentDueDate() {
        return nextPaymentDueDate;
    }

    @JsonProperty("next_payment_due_date")
    public void setNextPaymentDueDate(String nextPaymentDueDate) {
        this.nextPaymentDueDate = nextPaymentDueDate;
    }

    @Override
    public String toString() {
        return "Debt{" +
                "id=" + id +
                ", amount=" + amount +
//                ", payments=" + payments +
//                ", paymentPlan=" + paymentPlan +
                ", isInPaymentPlan=" + isInPaymentPlan +
                ", remainingAmount=" + remainingAmount +
                ", nextPaymentDueDate='" + nextPaymentDueDate + '\'' +
                '}';
    }
}