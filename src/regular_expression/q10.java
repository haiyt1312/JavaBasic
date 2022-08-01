package regular_expression;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ip;
//        System.out.println("Nhập IP (vd: 1.1.1.1) :");
//        ip = sc.nextLine();

        ip = "01.001.200.201";
        System.out.println(ip.replaceAll("(?<=^|\\.)0+(?!\\.|$)", ""));
    }
}
// Chưa hiểu (?<=^|\.)0+(?!\.|$) là gì
