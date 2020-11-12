package com.exxeta.model;

public enum Action {
    DEPOSIT,
    WITHDRAWL,
    OVERVIEW;

    static final String DEPOSIT_DE = "einzahlung";
    static final String WITHDRAWL_DE = "auszahlung";
    static final String OVERVIEW_DE = "übersicht";

    public static Action createAction(String action){
        switch (action) {
            case DEPOSIT_DE:
                return DEPOSIT;
            case WITHDRAWL_DE:
                return WITHDRAWL;
            case OVERVIEW_DE:
            default:
                return OVERVIEW;
        }
    }
}
