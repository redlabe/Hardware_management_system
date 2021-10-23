package com.hardware.commandPattern;

public class OrderStock implements Stock {
    private Stock s;

    public void BuyStock(Stock s){
        this.s = s;
    }

    public void execute() {
        s.execute();
    }
}
