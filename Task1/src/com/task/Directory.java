package com.task;

public class Directory {
    private String filePath;

    public Directory() {
        this.filePath = "C:\\Users\\reznik\\Documents";
    }

    public Directory(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
