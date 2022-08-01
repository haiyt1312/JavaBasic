package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static void nhapMang(Scanner sc, int a[], int n) {
        System.out.println("Nhập mảng");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " : ");
            a[i] = sc.nextInt();
        }
    }

    public static void bubbleSort(int a[], int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        n = sc.nextInt();

        int[] a = new int[n];
        nhapMang(sc, a, n);
        bubbleSort(a, n);
        System.out.println(Arrays.toString(a));
    }
}
