package math;

import java.util.Scanner;

public class q27 {
    public static boolean check(int n){
        int f0 = 0, f1 = 1, fn = 0;
        for (int i = 0; i< n; i++){
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            if (n == fn){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = sc.nextInt();

        if (n<2){
            System.out.println(n + " là số Fibonacci");
        } else if (check(n)) {
            System.out.println(n + " là số Fibonacci");
        }else
            System.out.println(n + " không là số Fibonacci");
    }
}
