package com.task;

import com.task.Enum.WrapType;

public class Wrap {
    private WrapType wrapType;
    private double priceWrap;

    Wrap(WrapType wrapType, double Price){
        this.wrapType = wrapType;
        this.priceWrap = Price;
    }
    @Override
    public String toString(){
        return wrapType + " " + priceWrap;
    }
}
