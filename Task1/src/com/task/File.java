package Task1;



public class File {
    private String Type;
    private Directory Directory;
    private String Name;
    private  String Content;
   public File (String type, Directory directory, String name){
        this.Type = type;
        this.Directory = directory;
        this.Name = name;
        this.Content = "";
    }
    public void showContent()
    {
        System.out.println(this.Content);
    }

    public Directory getDirectory() {
        return Directory;
    }

    public String getName() {
        return Name;
    }

    public String getContent() {
        return Content;
    }

    public String getType() {
        return Type;
    }

    public void setContent(String content) {
        this.Content = content;
    }

    public void Rename(String name)
    {
        String filePath =  this.Directory.getFilePath() + "\\" + this.Name + "." + this.Type;
        String newFilePath = this.Directory.getFilePath() + "\\" + name + "." + this.Type;
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
        this.Name = name;
    }
    public void createFile (){
        String filePath =  this.Directory.getFilePath() + "\\" + this.Name + "." + this.Type;
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
        String filePath =  this.Directory.getFilePath() + "\\" + this.Name + "." + this.Type;
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
