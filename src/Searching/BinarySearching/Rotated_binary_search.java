package Searching.BinarySearching;

public class Rotated_binary_search {

    public static void main(String[] args) {
        int [] arr = { 4,5,6,7,0,1,2};

    }

    static int findpivot(int [] arr){

        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }

            if(arr[mid]<arr[mid+-1]){
                return mid-1;
            }

        }

    }



    static int BinarySearch(int[] arr, int target ,int start,int end) {

        while (start <= end) {
            // find the mid
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;

            }
            else if (target > arr[mid]) {
                start = mid + 1;
            } else{
                return mid;
            }

        }
        return  -1 ;

    }

}
