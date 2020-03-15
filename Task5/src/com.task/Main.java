package com.task;

import com.task.Enum.SweetType;
import com.task.Enum.WrapType;

public class Main {

    public static void main(String[] args) {
	System.out.println("let's create a gift");
	Gift gift = new Gift();
	System.out.println("How many sweets will we add?");
	int sweetsCount = 4;
	for( int i = 0; i < sweetsCount; i++) {
	    gift.newBuilder().setSweet(SweetType.Biscuit,56.00, 2).build();
    }
    System.out.println("Which wrapper you choose?");
	gift.newBuilder().setWrapping(WrapType.Box, 20);
	System.out.println(gift.toString());
    }

}
