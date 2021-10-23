package com.hardware.commandPattern;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Stock> sList = new ArrayList<Stock>();

    public void addStock(Stock s){
        sList.add(s);
    }

    public void removeStock(){

        for (Stock en : sList) {
            en.execute();
        }
        sList.clear();
    }
}

