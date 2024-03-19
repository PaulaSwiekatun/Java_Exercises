package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class CreateFiles {

    public static void main(String[] args) throws IOException {
        File files = new File("test.txt");
        if(files.createNewFile()) {
            System.out.println("create new files");
        } else {
            System.out.println("file already exists");
        }
    }
}
