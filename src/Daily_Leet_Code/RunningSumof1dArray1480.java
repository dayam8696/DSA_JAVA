package Daily_Leet_Code;

import java.util.Arrays;

public class RunningSumof1dArray1480 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(arr)));

    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length; i++) {
            sum = nums[i] +nums[i-1];
            nums[i] = sum;

        }
        return nums;
    }
}
