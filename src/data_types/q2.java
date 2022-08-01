package data_types;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inch;
        System.out.println("Input a value for inch: ");
        inch = sc.nextInt();
        double meter = 0.0254;
        System.out.println(inch + " inch is " + inch * meter + " meters");
    }
}
