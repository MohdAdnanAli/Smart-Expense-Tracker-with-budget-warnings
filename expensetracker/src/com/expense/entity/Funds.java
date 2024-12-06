package com.expense.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "funds")
public class Funds {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fundId;

    @Column(nullable = false)
    private String source;

    @Column(nullable = false)
    private double amount;

    private String description;

    private int year;
    private int month;
    private int day;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
