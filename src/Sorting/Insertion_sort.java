package Sorting;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int [] arr = {5,3,4,1,2};
        intsertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void intsertion(int[] arr) {
        for (int i = 0 ; i< arr.length-1;i++){
            for (int j = i+1 ;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr ,j,j-1);
                }
                else {
                    break;
                }
            }
        }

    }

   static void swap(int[] arr, int second, int first ) {
        int temp = arr[second];
        arr[second] = arr[first];
        arr[first]= temp;

    }
}
