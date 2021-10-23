package com.hardware;


public class BuildingMaterialSupplier extends Supplier {
    @Override
    void order() {
        System.out.println("Ordering building material supplies");
    }

    @Override
    void returnOrder() {
        System.out.println("Cancelling building material supplies order");
    }
}


