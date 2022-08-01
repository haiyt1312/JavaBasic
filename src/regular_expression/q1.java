package regular_expression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String chuoi = "";
        System.out.println("Nhập chuỗi: ");
        chuoi = sc.nextLine();
        System.out.println("Chuỗi đã nhập : " + chuoi);
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$");
        if (pattern.matcher(chuoi).find()){
            System.out.println("Chuỗi nhập hợp lệ");
        }else {
            System.out.println("Chuỗi nhập k hợp lệ");
        }
    }
}
