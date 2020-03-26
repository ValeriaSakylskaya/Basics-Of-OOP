package com.task;

import java.util.ArrayList;

public class Payment {
    private ArrayList<Product> productList = new ArrayList<Product>();
    Product product;

    public void addProduct(String productName, int quantity, double count) {
        product = new Product(productName, quantity, count);
        productList.add(product);
    }

    public void makeOrder() {
        System.out.println("Name:  Quantity:  Count:  ");
        for (Product p : productList) {
            System.out.println(p.toString());
        }
        System.out.println(" Total sum: " + getTotalSum());
    }

    private double getTotalSum() {
        double Sum = 0;
        for (Product p : productList) {
            Sum += (p.count * p.quantity);
        }
        return Sum;
    }

    protected class Product {
        private double count;
        private String name;
        private int quantity;

        Product(String name, int quantity, double count) {
            this.name = name;
            this.quantity = quantity;
            this.count = count;
        }

        @Override

        public String toString() {
            return this.name + " : " + this.quantity + " : " + this.count + ";";
        }
    }
}
