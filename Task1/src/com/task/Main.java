package com.task;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
        вывести на консоль содержимое, дополнить, удалить.*/
        Directory directory = new Directory("C:\\Users\\myUser\\Documents");
        TextFile textFile = new TextFile(directory, "qwerty");
        textFile.createFile();
        textFile.renameFile("aqws");
        textFile.addContent("wow");
        textFile.showFileContent();
        textFile.deleteFile();
    }
}
