package Searching.BinarySearching;

import java.util.Arrays;

//problem link - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//problem  -  34. Find First and Last Position of Element in Sorted Array
public class leet_code_problem_34 {
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = (searchRange(nums,target));
        System.out.println(Arrays.toString(ans));

    }

   public static int[] searchRange(int[] nums, int target) {
       int[] ans = {-1, -1};
       // check for first occurrence if target first
       int start = search(nums,target,true);
       int end = search(nums,target,false);
       ans[0] = start;
       ans[1] = end;
       return ans;

    }

   public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
