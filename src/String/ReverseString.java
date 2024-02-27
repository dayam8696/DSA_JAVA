package String;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String [] dym = {"h" ,"e" ,"l","l","o"};
        System.out.println(Arrays.toString(reverstring(dym)));
    }

    private static String[] reverstring(String [] dym) {
        int start = 0;
        int end = dym.length-1;
        while (start<end){
            if (start<end){
                swap(dym,start,end);
            }
            start++;
            end--;
        }
        return dym;
    }

    static void swap(String[] arr, int first, int second) {
        String temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
