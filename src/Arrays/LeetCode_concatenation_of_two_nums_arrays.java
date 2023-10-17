package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode_concatenation_of_two_nums_arrays {


    // leet code problem link - https://leetcode.com/problems/concatenation-of-array/
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int [] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] getConcatenation(int[] nums) {

        int [] nums1 = nums;
        int [] c = new int[nums.length + nums1.length]; // size 6

        for (int i = 0; i < nums.length; i++) {
            c[i]= nums[i];
        }

        for (int i = 0; i < nums1.length; i++) {
            c[i+nums.length] = nums1[i];
        }
      return c;
    }


}




