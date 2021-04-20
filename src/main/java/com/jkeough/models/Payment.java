package com.jkeough.models;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "payment_plan_id",
        "amount",
        "date"
})
@Generated("jsonschema2pojo")
public class Payment implements Serializable
{

    @JsonProperty("payment_plan_id")
    private int paymentPlanId;
    @JsonProperty("amount")
    private double amount;
    @JsonProperty("date")
    private String date;
    private final static long serialVersionUID = -3303933523855916554L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Payment() {
    }

    /**
     *
     * @param date
     * @param amount
     * @param paymentPlanId
     */
    public Payment(int paymentPlanId, double amount, String date) {
        super();
        this.paymentPlanId = paymentPlanId;
        this.amount = amount;
        this.date = date;
    }

    @JsonProperty("payment_plan_id")
    public int getPaymentPlanId() {
        return paymentPlanId;
    }

    @JsonProperty("payment_plan_id")
    public void setPaymentPlanId(int paymentPlanId) {
        this.paymentPlanId = paymentPlanId;
    }

    @JsonProperty("amount")
    public double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentPlanId=" + paymentPlanId +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                '}';
    }
}