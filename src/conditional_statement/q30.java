package conditional_statement;

import java.util.Scanner;

public class q30 {
    public static void main(String[] args) {
        int number1, number2, number3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number: ");
        number1 = scanner.nextInt();
        System.out.println("second number: ");
        number2 = scanner.nextInt();
        System.out.println("third number: ");
        number3 = scanner.nextInt();
        if (number1 == number2 && number1 == number3){
            System.out.println("All numbers are equal");
        } else if (number1 != number2 && number1 != number3) {
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }
}
