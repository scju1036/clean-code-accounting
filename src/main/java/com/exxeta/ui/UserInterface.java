package com.exxeta.ui;

public class UserInterface {

    public static void printErrorWrongArgumentNumber(){
        System.out.println("Wrong number of arguments. Examples are:\neinzahlung 4000\nauszahlung 400 Miete\nübersicht 9 2020");
    }

    public static void printDeposit(Double balance) {
        System.out.println("Kassenbestand: " + balance.toString() + " EUR");
    }
}
