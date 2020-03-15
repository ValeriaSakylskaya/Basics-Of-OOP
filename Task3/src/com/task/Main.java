package com.task;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
выходных и праздничных днях.
*/
        Calendar calendar = new Calendar();
        calendar.showAllWeekend();
        calendar.showAllPublicHoliday();
    }
}
