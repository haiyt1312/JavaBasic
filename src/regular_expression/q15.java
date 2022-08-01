package regular_expression;

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        System.out.println("Nhập chuỗi: ");
        str = sc.nextLine();

        System.out.println("Chuỗi vừa nhập: " + str);
        System.out.println("Chuỗi sau khi nguyên âm: " + str.replaceAll("[aeiou]", ""));
    }
}
