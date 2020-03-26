package com.task;


public class File {
    private String type;
    private Directory directory;
    private String name;
    private String content;

    public File(String type, Directory directory, String name) {
        this.type = type;
        this.directory = directory;
        this.name = name;
        this.content = "";
    }

    public void showFileContent() {
        System.out.println(this.content);
    }

    public Directory getDirectory() {
        return directory;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getType() {
        return type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void renameFile(String name) {
        String filePath = this.directory.getFilePath() + "\\" + this.name + "." + this.type;
        String newFilePath = this.directory.getFilePath() + "\\" + name + "." + this.type;
        try {
            java.io.File f = new java.io.File(filePath);
            java.io.File newF = new java.io.File(newFilePath);
            if (f.renameTo(newF))
                System.out.println("File rename");
            else
                System.out.println("error");
        } catch (Exception e) {
            System.err.println(e);
        }
        this.name = name;
    }

    public void createFile() {
        String filePath = this.directory.getFilePath() + "\\" + this.name + "." + this.type;
        try {
            java.io.File f = new java.io.File(filePath);
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void deleteFile() {
        String filePath = this.directory.getFilePath() + "\\" + this.name + "." + this.type;
        try {
            java.io.File f = new java.io.File(filePath);
            if (f.delete())
                System.out.println("File delete");
            else
                System.out.println("File is not exists");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
