package com.hardware.iteratorPattern;


public class ItemType
{
    BuildingItems i;

    public ItemType(BuildingItems i)
    {
        this.i = i;
    }

    public void restockedItems()
    {
        Iterator iterator = i.createIterator();
        System.out.println("-------Restocking items ------------");
        while (iterator.hasNext())
        {
            Item x = (Item)iterator.next();
            System.out.println(x.getItems());
        }
    }
}


