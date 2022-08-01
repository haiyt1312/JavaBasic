package array;

import java.util.ArrayList;

public class q25 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 5, 7, 9};
        int[] arr3 = {3, 4, 5, 6, 7};
        int x = 0, y = 0, z = 0;
        while (x < arr1.length && y < arr2.length && z < arr3.length) {
            if (arr1[x] == arr2[y] && arr1[x] == arr3[z]) {
                list.add(arr1[x]);
                x++;
                y++;
                z++;
            } else if (arr1[x] < arr2[y])
                x++;
            else if (arr2[y] < arr3[z])
                y++;
            else
                z++;
        }
        System.out.println("Phần tử chung trong các mảng: " + list);
    }
}
