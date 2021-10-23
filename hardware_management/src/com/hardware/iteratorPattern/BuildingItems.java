package com.hardware.iteratorPattern;


public class BuildingItems implements Collection
{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Item[] i;

    public BuildingItems()
    {
        i = new Item[MAX_ITEMS];

        addItem("Nails added to building materials");
        addItem("Bricks added to building materials");
    }

    public void addItem(String str)
    {
        Item x = new Item(str) {
            @Override
            public String toString() {
                return super.toString();
            }
        };
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else
        {
            i[numberOfItems] = x;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator()
    {
        return new ItemsIterator(i);
    }

}

