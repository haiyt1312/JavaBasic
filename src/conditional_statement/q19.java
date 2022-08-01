package conditional_statement;

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng : ");
        n = scanner.nextInt();

        int s = n;
        for (int i = 1; i <= n; i++) {
            for (int x = s; x != 0; x--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            s--;
        }
    }
}
