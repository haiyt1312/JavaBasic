package math;

import java.util.Scanner;

public class q3 {
    public static void check(double a){
        int temp = (int) a;
        if (a / temp == 1) {
            System.out.println(a + " là số kiểu integer");
        } else
            System.out.println(a + " không là số kiểu integer");
    }
    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = sc.nextDouble();
        check(a);
    }
}
