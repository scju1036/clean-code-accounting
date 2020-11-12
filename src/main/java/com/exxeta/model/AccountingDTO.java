package com.exxeta.model;

import java.util.Date;

public class AccountingDTO {
    private Date date;
    private Double amount;
    private String category;

    public AccountingDTO(Date date, Double amount, String category) {
        this.date = date;
        this.amount = amount;
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return date + ";" + amount + ";" + category;
    }
}
