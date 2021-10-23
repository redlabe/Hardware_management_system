package com.hardware;


public abstract class Supplier {

    abstract void order();
    abstract void returnOrder();

    public final void orderSupplies(){
        order();
    }

    public final void cancelOrder(){
        returnOrder();
    }
}


