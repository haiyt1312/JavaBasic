package numbers;

import java.util.Scanner;

public class q28 {
    public static void main(String[] args) {
        int n, x, temp, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số: ");
        n = sc.nextInt();

        temp = n;
        while (n > 0) {
            x = n % 10;
            sum += x * x * x;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is Armstrong number? true");
        } else
            System.out.println(temp + " not is Armstrong number? false");
    }
}
