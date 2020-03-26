package com.task;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
        нескольких товаров.*/
        Payment payment = new Payment();
        payment.addProduct("milk", 2, 2.35);
        payment.addProduct("bread", 1, 2.47);
        payment.makeOrder();
    }
}
