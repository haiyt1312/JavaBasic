package file_input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q11 {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "C:\\Users\\Admin\\Desktop\\Java Basic/abc.txt";

        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner sc = new Scanner(fileInputStream);

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
