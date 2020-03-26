package com.task;

import com.task.Enum.SweetType;
import com.task.Enum.WrapType;

public class Main {
    /*Задача 5.
    Создать консольное приложение, удовлетворяющее следующим требованиям:
    • Корректно спроектируйте и реализуйте предметную область задачи.
    • Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
    проектирования.
    • Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
    • для проверки корректности переданных данных можно применить регулярные выражения.
    • Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
    • Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
    Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
    подарок). Составляющими целого подарка являются сладости и упаковка.*/
    public static void main(String[] args) {
        System.out.println("Let's create a gift");
        int sweetsCount = 4;
        System.out.println("Let's add to gift " + sweetsCount + " sweets");
        System.out.println("With box wrap");
        Gift gift = new Gift();
        gift.newBuilder()
            .setSweet(SweetType.Biscuit, 56.00, 2)
            .setSweet(SweetType.Marmalade, 8.00, 2)
            .setSweet(SweetType.ChocolateCandies, 26.00, 6)
            .setSweet(SweetType.NougatBar, 666.00, 5)
            .setWrap(WrapType.Box, 20)
            .build();
        System.out.println("Here is you gift");
        System.out.println(gift.toString());
    }

}
