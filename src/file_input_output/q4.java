package file_input_output;

import java.io.File;

public class q4 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop\\Java Basic/abc.txt");

        System.out.println(file.canRead());

        System.out.println(file.canWrite());
    }
}
