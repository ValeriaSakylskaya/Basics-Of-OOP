package com.task;

public class Treasure implements Comparable<Treasure> {
    private String name;
    private double cost;

    public Treasure(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "treasure: " + this.name + " cost: " + this.cost;
    }

    @Override
    public int compareTo(Treasure treasure) {
        if (this.cost < treasure.cost)
            return -1;
        else if (treasure.cost < this.cost)
            return 1;
        return 0;
    }
}
