package Daily_Leet_Code;

import java.util.Arrays;

public class LeftandRightSumDifferences2574 {
    public static void main(String[] args) {
        int [] nums = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
    public static int[] leftRightDifference(int[] num){
        int  n = num.length;
        int [] leftSum = new int[n];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i-1] + num[i-1];

        }
        int [] rightSum = new int[n];
        for (int i = n-2; i >=0 ; i--) {
            rightSum[i] = rightSum[i+1] +num[i+1];

        }
        int [] finalSum = new int [n];
        for (int i = 0; i < n; i++) {
            finalSum[i] = Math.abs(leftSum[i] - rightSum[i]);

        }
        return finalSum;
    }
}
