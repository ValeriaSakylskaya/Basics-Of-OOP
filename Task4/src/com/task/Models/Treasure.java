package com.task;

public class Treasure implements Comparable<Treasure> {
    private String nameTreasure;
    private double costTreasure;

    public Treasure(String Name, double cost) {
        this.nameTreasure = Name;
        this.costTreasure = cost;
    }

    public double getCostTreasure() {
        return costTreasure;
    }

    @Override
    public String toString() {
        return "treasure: " + this.nameTreasure + " cost: " + this.costTreasure;
    }

    @Override
    public int compareTo(Treasure other) {
        if (this.costTreasure < other.costTreasure)
            return -1;
        else if (other.costTreasure < this.costTreasure)
            return 1;
        return 0;
    }
}
