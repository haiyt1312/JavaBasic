package array;

import java.util.ArrayList;
import java.util.List;

public class q55 {
    public static void check(int[] A) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            list.removeAll(list);
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                list.add(A[j]);
                if (sum == 0){
                    System.out.println("Sub-arrays with 0 sum : "+ list.toString());
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
        int[] nums2 = { 1, 2, -3, 4, 5, 6};
        int[] nums3 = { 1, 2, -2, 3, 4, 5, 6 };
        check(nums1);
        check(nums2);
        check(nums3);
    }
}
