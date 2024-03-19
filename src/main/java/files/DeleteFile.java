package files;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        File file = new File("text.txt");

        if(file.delete()) {
            System.out.println("The file has been deleted");
        } else {
            System.out.println("failed to delete the file");
        }
    }
}
