package basic_part_i;

import java.util.Scanner;

public class q120 {
    public static void nhapMT(Scanner scanner, int m, int n, int[][] Matrix){
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matrix[" + i + "][" + j + "] = ");
                Matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void inMT(int m, int n, int[][] Matrix){
        System.out.println("Ma trận vừa nhập:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Matrix[i][j] + "  ");
            }
            System.out.println("\n");
        }
    }
    public static boolean checkNumber(int[][] Matrix,int m,int  n, int target) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (Matrix[i][j] == target) {
                    count++;
                }
            }
        }
        if (count > 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n, m;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();

        int Matrix[][] = new int[m][n];

        nhapMT(scanner, m, n, Matrix);
        inMT(m, n, Matrix);

        System.out.println("Nhập vào số cần tìm: ");
        int target = scanner.nextInt();
        if (checkNumber(Matrix, m, n, target) == true) {
            System.out.println(target + " có xuất hiện trong ma trận");
        } else {
            System.out.println(target + " không xuất hiện trong ma trận");
        }
    }
}
