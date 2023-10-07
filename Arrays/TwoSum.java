package Array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6, 8};
        int target = 6;
        System.out.println(twoSum(arr, target));

    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int a[] = {i, j};
                    return a;
                }
            }
        }
        return null;
    }
}



