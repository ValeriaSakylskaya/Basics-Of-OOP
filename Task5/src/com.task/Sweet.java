package com.task;

import com.task.Enum.SweetType;

public class Sweet {
    private SweetType sweetType;
    private double priceSweet;
    private double countSweet;

    public Sweet(SweetType sweetType, double price, double count) {
        this.sweetType = sweetType;
        this.priceSweet = price;
        this.countSweet = count;
    }

    public SweetType getSweetType() {
        return sweetType;
    }

    public double getPriceSweet() {
        return priceSweet;
    }

    public double getCountSweet() {
        return countSweet;
    }
    @Override
    public String toString(){
        return sweetType + " count: " + countSweet + " price: " + priceSweet;
    }




}

