package Sorting.Cyclic_sort;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 4};
        System.out.println(Arrays.toString(missingnum(arr)));

    }

    public static int[] missingnum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index +1) {
                return new int[] {arr[index] , index +1};
            }
        }


        return new int[] {-1 ,-1};
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;

    }
}