package math;

import java.util.Scanner;

public class q20 {
    public static boolean checkSoNgTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        System.out.print("Các số nguyên tố nhỏ hơn " + n + " : ");
        for (int i = 0; i < n; i++) {
            if (checkSoNgTo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
