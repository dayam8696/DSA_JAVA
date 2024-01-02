package Sorting;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void Bubble_sort(int[] arr) {
        boolean swapped;
        // run the step n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step ,max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                //swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i it means array is sorted end the program break
            if ((!swapped)){
                break;
            }
        }
    }
}



