package Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TextFile extends File {

    public TextFile(Directory directory, String name) {
        super("txt", directory, name);
    }
    public void addContent (String text){
        String fullName = this.getDirectory().getFilePath() + "\\" + this.getName() + "." + this.getType();
        try {
            Files.write(Paths.get(fullName), text.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e);
        }
        this.setContent(super.getContent() + text);
    }
}
