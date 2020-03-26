package com.task;

import com.task.Enum.WrapType;

public class Wrap {
    private WrapType type;
    private double price;

    Wrap(WrapType type, double price){
        this.type = type;
        this.price = price;
    }
    @Override
    public String toString(){
        return type + " " + price;
    }
}
