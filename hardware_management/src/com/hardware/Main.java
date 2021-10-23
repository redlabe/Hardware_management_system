package com.hardware;

import com.hardware.commandPattern.Invoker;
import com.hardware.commandPattern.PayForStock;
import com.hardware.commandPattern.Stock;
import com.hardware.iteratorPattern.BuildingItems;
import com.hardware.iteratorPattern.ItemType;

public class Main {

    public static void main(String[] args) {
        Management m = new Management();
        m.meetingNotification();
        BuildingMaterialSupplier bms = new BuildingMaterialSupplier();
        bms.order();
        m.closingNotification();
        BuildingItems b = new BuildingItems();
        ItemType i = new ItemType(b);
        i.restockedItems();

    }
}
