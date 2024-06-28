package Recursion_Arrays;

import org.jetbrains.annotations.Contract;

public class Sorted_Or_Not {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,6};
        System.out.println(IsSorted(arr , 0));
    }

    @Contract(pure = true)
    static boolean IsSorted(int[] arr, int i) {
        if (i == arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && IsSorted(arr , i+1);
    }
}
