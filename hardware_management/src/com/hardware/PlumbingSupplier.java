package com.hardware;

public class PlumbingSupplier extends Supplier {

    @Override
    void order() {
        System.out.println("Ordering plumbing supplies");
    }

    @Override
    void returnOrder() {
        System.out.println("Cancelling plumbing supplies order");
    }
}



