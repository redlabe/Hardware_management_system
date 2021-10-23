package com.hardware.iteratorPattern;


class ItemsIterator implements Iterator
{
    Item[] iL;

    int pos = 0;

    public  ItemsIterator (Item[] iL)
    {
        this.iL = iL;
    }

    public Object next()
    {
        Item i =  iL[pos];
        pos += 1;

        return i;
    }

    public boolean hasNext()
    {
        if (pos >= iL.length ||
                iL[pos] == null)
            return false;
        else
            return true;
    }
}

