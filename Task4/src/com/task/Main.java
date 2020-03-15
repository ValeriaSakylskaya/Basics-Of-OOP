package com.task;

import com.task.Services.TreasureService;

public class Main {

    public static void main(String[] args) {
        System.out.println("The cave is open");
        TreasureService treasures = new TreasureService();
        System.out.println("Treasures found");
        treasures.viewTreasure();
		System.out.println("Most Expensive Treasure" + treasures.getMostExpensiveTreasure());
        System.out.println("Selected treasures");
        treasures.viewTreasure(treasures.getTreasuresBySum(456));
    }
}
