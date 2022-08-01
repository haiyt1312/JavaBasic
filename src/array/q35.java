package array;

import java.util.ArrayList;

public class q35 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int target = 6;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    list.add(arr[i]);
                    list.add(arr[j]);
                }
            }
        }
        System.out.println(list);
    }
}
