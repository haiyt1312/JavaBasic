package string;

import java.util.Scanner;

public class q88 {
    public static void thayTheChuoi(Scanner sc,String str1){
        String str2, str3;
        System.out.println("Nhập chuỗi cần thay thế: ");
        str2 = sc.nextLine();
        System.out.println("Nhập chuỗi cần thay thế: ");
        str3 = sc.nextLine();
        System.out.println("Chuỗi đã thay thế: "+str1.replaceAll(str2, str3));
    }
    public static void main(String[] args) {
        String str1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        str1 = sc.nextLine();
        thayTheChuoi(sc, str1);
    }
}
