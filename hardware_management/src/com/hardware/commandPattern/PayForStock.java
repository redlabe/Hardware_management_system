package com.hardware.commandPattern;


public class PayForStock {

    private String item = "building material";
    private int price = 10000;

    public void pay(){
        System.out.println("Payment for "+item+", at "+price+" has been disbursed");
    }
}

