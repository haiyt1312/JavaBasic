package math;

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        int coSo, soMu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cơ số: ");
        coSo = sc.nextInt();
        System.out.println("Nhập số mũ: ");
        soMu = sc.nextInt();

        System.out.println(Math.pow(coSo,soMu));
    }
}
