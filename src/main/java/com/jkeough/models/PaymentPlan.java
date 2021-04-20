package com.jkeough.models;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "debt_id",
        "amount_to_pay",
        "installment_frequency",
        "installment_amount",
        "start_date"
})
@Generated("jsonschema2pojo")
public class PaymentPlan implements Serializable
{

    @JsonProperty("id")
    private int id;
    @JsonProperty("debt_id")
    private int debtId;
    @JsonProperty("amount_to_pay")
    private double amountToPay;
    @JsonProperty("installment_frequency")
    private String installmentFrequency;
    @JsonProperty("installment_amount")
    private double installmentAmount;
    @JsonProperty("start_date")
    private String startDate;
    private final static long serialVersionUID = 5236597950252100411L;

    /**
     * No args constructor for use in serialization
     *
     */
    public PaymentPlan() {
    }

    /**
     *
     * @param amountToPay
     * @param installmentFrequency
     * @param installmentAmount
     * @param id
     * @param debtId
     * @param startDate
     */
    public PaymentPlan(int id, int debtId, double amountToPay, String installmentFrequency, double installmentAmount, String startDate) {
        super();
        this.id = id;
        this.debtId = debtId;
        this.amountToPay = amountToPay;
        this.installmentFrequency = installmentFrequency;
        this.installmentAmount = installmentAmount;
        this.startDate = startDate;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("debt_id")
    public int getDebtId() {
        return debtId;
    }

    @JsonProperty("debt_id")
    public void setDebtId(int debtId) {
        this.debtId = debtId;
    }

    @JsonProperty("amount_to_pay")
    public double getAmountToPay() {
        return amountToPay;
    }

    @JsonProperty("amount_to_pay")
    public void setAmountToPay(double amountToPay) {
        this.amountToPay = amountToPay;
    }

    @JsonProperty("installment_frequency")
    public String getInstallmentFrequency() {
        return installmentFrequency;
    }

    @JsonProperty("installment_frequency")
    public void setInstallmentFrequency(String installmentFrequency) {
        this.installmentFrequency = installmentFrequency;
    }

    @JsonProperty("installment_amount")
    public double getInstallmentAmount() {
        return installmentAmount;
    }

    @JsonProperty("installment_amount")
    public void setInstallmentAmount(double installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "PaymentPlan{" +
                "id=" + id +
                ", debtId=" + debtId +
                ", amountToPay=" + amountToPay +
                ", installmentFrequency='" + installmentFrequency + '\'' +
                ", installmentAmount=" + installmentAmount +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}