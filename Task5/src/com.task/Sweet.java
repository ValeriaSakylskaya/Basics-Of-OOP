package com.task;

import com.task.Enum.SweetType;

public class Sweet {
    private SweetType type;
    private double price;
    private double count;

    public Sweet(SweetType type, double price, double count) {
        this.type = type;
        this.price = price;
        this.count = count;
    }

    public SweetType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getCount() {
        return count;
    }
    @Override
    public String toString(){
        return type + " count: " + count + " price: " + price;
    }




}

