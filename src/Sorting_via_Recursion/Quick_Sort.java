package Sorting_via_Recursion;

import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int [] nums = {5,4,3,2,1};
        quicksort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    static void quicksort(int []mums ,int low ,int hi){
        if (low>=hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s+(e-s)/2;
        int pivot = mums[m];

        while(s<=e){
            while (mums[s]< pivot){
                s++;
            }
            while (mums[e]> pivot){
                e--;
            }
            if (s<=e){
                int temp = mums[s];
                mums[s] =mums[e];
                mums[e] = temp;
                s++;
                e--;
            }
        }
        quicksort(mums,low,e);
        quicksort(mums,s,hi);
    }
}
