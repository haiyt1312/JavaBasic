package file_input_output;

import java.io.*;

public class q16 {
    public static void main(String[] args) {
        String url = "C:\\Users\\Admin\\Desktop\\Java Basic/abc.txt";

        try {
            File file = new File(url);
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.println("");
            printWriter.println("^^^^^^^^^^^^^^^^^");
            printWriter.println("@@@@@@@@@@@@@@@@@");
            printWriter.close();

            System.out.println("Thêm thành công!");
        }catch (IOException e){
            System.out.println("Exception occurred:");
            e.printStackTrace();
        }

    }
}
