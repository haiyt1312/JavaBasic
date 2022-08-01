package string;

import java.util.Scanner;

public class q82 {
    public static void newString(String str1) {
        String newString = "";
        for (int i = 0; i < str1.length(); i++) {
            newString += str1.substring(i, i + 1) + str1.substring(i, i + 1);
        }
        System.out.println("Chuỗi mới: " + newString);
    }

    public static void main(String[] args) {
        String str1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất: ");
        str1 = sc.nextLine();
        newString(str1);
    }
}
