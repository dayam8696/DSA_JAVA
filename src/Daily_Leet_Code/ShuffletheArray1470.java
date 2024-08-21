package Daily_Leet_Code;

import java.util.Arrays;

public class ShuffletheArray1470 {
    public static void main(String[] args) {
        int [] arr = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int [] arr = new int[2*n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[count] = nums[i];
            arr[count+1] = nums[i+n];
            count = count+2;
        }
        return arr;
    }
}
