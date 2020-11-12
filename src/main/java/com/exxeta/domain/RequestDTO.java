package com.exxeta.domain;

import java.util.Date;

public class RequestDTO {

    private Action action;
    private Double amount;
    private String category;
    private Date date;

    public RequestDTO(){}

    public RequestDTO(Action action, Double amount, String category, Date date){
        this.action = action;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
