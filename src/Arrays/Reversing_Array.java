package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Reversing_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[4];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
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

