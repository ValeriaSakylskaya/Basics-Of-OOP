package com.task;

import java.util.ArrayList;

public class Payment {
    private ArrayList<Product> products = new ArrayList<Product>();
    Product product;

    public void addProduct(String productName, int quantity, double count) {
        product = new Product(productName, quantity, count);
        products.add(product);
    }

    public void makeOrder() {
        System.out.println("Name:  Quantity:  Count:  ");
        for (Product p : products) {
            System.out.println(p.toString());
        }
        System.out.println(" Total sum: " + getTotalSum());
    }

    private double getTotalSum() {
        double Sum = 0;
        for (Product p : products) {
            Sum += (p.count * p.quantity);
        }
        return Sum;
    }

    protected class Product {
        private double count;
        private String productName;
        private int quantity;

        Product(String productName, int quantity, double count) {
            this.productName = productName;
            this.quantity = quantity;
            this.count = count;
        }

        @Override

        public String toString() {
            return this.productName + " : " + this.quantity + " : " + this.count + ";";
        }
    }
}
