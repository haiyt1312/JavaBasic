package numbers;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        int s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phạm vi:");
        System.out.println("Nhập số thứ nhất: ");
        s1 = sc.nextInt();
        System.out.println("Nhập số thứ 2: ");
        s2 = sc.nextInt();
        if (s2>s1){
            System.out.println((int)(Math.random() * (s2 - s1 + 1) + s1));
        }else
            System.out.println((int)(Math.random() * (s1 - s2 + 1) + s2));
    }
}
