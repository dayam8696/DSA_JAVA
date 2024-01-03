package Sorting;

public class Selection_sort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};

    }

    static void selection(int []arr){
        for (int i =0 ;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr ,0,last);
            swap(a)

        }
    }

     static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start ;i<=end ;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
