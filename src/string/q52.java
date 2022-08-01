package string;

import java.util.Scanner;

public class q52 {
    public static void main(String[] args) {
        String str1, str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất: ");
        str1 = sc.nextLine();
        System.out.println("Nhập chuỗi thứ 2: ");
        str2 = sc.nextLine();
        String str3 = str1 + str1;
        System.out.println("The concatination of 1st string twice is: " + str3);
        System.out.println("The 2nd string " + str2 + " exists in the new string.");
        if (str3.contains(str2)) {
            System.out.println(str2 + " is rotation of " + str1);
        } else
            System.out.println(str2 + " is not rotation of " + str1);
    }
}
