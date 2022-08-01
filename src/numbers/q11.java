package numbers;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        int length = Integer.toString(n).length();

        int copy = n,sum = 0, d = 0;
        while (copy > 0) {
            d = copy % 10;
            sum = sum + (int)Math.pow(d,length);
            length--;
            copy = copy / 10;
        }

        if (sum == n) {
            System.out.println(n + " is a Disarium number");
        } else
            System.out.println(n + " not a Disarium Number");
    }
}
