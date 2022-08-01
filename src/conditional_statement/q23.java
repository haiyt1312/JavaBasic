package conditional_statement;

import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng : ");
        n = scanner.nextInt();

        for (int i = n; i > 0; i--){
            for (int spc = n - i; spc > 0; spc --){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
