package method;

import java.util.Scanner;

public class q3 {
    public static void checkKyTuGiua(String str1) {
        String str2;
        if (str1.length() % 2 == 0) {
            str2 = str1.substring(str1.length() / 2 - 1, (str1.length() / 2) + 1);
        } else {
            str2 = str1.substring(str1.length() / 2, (str1.length() / 2) + 1);
        }

        System.out.println("Ký tự giữa trong chuỗi: " + str2);
    }

    public static void main(String[] args) {
        String str1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        str1 = sc.nextLine();
        checkKyTuGiua(str1);
    }
}
