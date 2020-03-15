package com.task;



public class File {
    private String typeFile;
    private Directory directoryFile;
    private String nameFile;
    private  String contentFile;
   public File (String type, Directory directory, String name){
        this.typeFile = type;
        this.directoryFile = directory;
        this.nameFile = name;
        this.contentFile = "";
    }
    public void showContentFile()
    {
        System.out.println(this.contentFile);
    }

    public Directory getDirectoryFile() {
        return directoryFile;
    }

    public String getNameFile() {
        return nameFile;
    }

    public String getContentFile() {
        return contentFile;
    }

    public String getTypeFile() {
        return typeFile;
    }

    public void setContentFile(String contentFile) {
        this.contentFile = contentFile;
    }

    public void renameFile(String name) {
        String filePath =  this.directoryFile.getFilePath() + "\\" + this.nameFile + "." + this.typeFile;
        String newFilePath = this.directoryFile.getFilePath() + "\\" + name + "." + this.typeFile;
        try {
            java.io.File f = new java.io.File(filePath);
            java.io.File newF = new java.io.File(newFilePath);
            if (f.renameTo(newF))
                System.out.println("File rename");
            else
                System.out.println("error");
        }
        catch (Exception e) {
            System.err.println(e);
        }
        this.nameFile = name;
    }

    public void createFile (){
        String filePath =  this.directoryFile.getFilePath() + "\\" + this.nameFile + "." + this.typeFile;
        try {
            java.io.File f = new java.io.File(filePath);
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }

    public void deleteFile (){
        String filePath =  this.directoryFile.getFilePath() + "\\" + this.nameFile + "." + this.typeFile;
        try {
            java.io.File f = new java.io.File(filePath);
            if (f.delete())
                System.out.println("File delete");
            else
                System.out.println("File is not exists");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
