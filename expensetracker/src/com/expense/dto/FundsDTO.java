package com.expense.dto;

public class FundsDTO {

    private int fundId;
    private String source;
    private double amount;
    private String description;

    public FundsDTO() {}

    public FundsDTO(int fundId, String source, double amount, String description) {
        this.fundId = fundId;
        this.source = source;
        this.amount = amount;
        this.description = description;
    }

    // Getters and Setters
    public int getFundId() {
        return fundId;
    }

    public void setFundId(int fundId) {
        this.fundId = fundId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
