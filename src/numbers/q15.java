package numbers;

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        String str = Integer.toString(n);
        int length = Integer.toString(n).length();

        int count = 0;
        for (int i = 1; i < length; i++) {
            if (str.contains("0")) {
                count = 1;
            }
        }

        if (count > 0) {
            System.out.println(n + " is a Duck Number");
        } else
            System.out.println(n + " not is a Duck Number");
    }
}
