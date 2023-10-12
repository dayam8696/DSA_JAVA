package Arrays;

import java.util.Arrays;

public class Reversing_Array {
    public static void main(String[] args) {
        int [] arr = {1 ,3 ,9 ,6,4};
       reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int []arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swaapping(arr,start,end);
            start++;
            end--;
        }
    }
    static void swaapping(int []arr ,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

