package Arrays;

import java.util.Arrays;

public class Swaping_array_element {
    public static void main(String[] args) {
        int [] arr = {1 ,3 ,9 ,6,4};
        swap(arr ,1 ,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr [] ,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
