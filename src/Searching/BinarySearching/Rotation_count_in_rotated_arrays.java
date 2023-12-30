package Searching.BinarySearching;

public class Rotation_count_in_rotated_arrays {
    public static void main(String[] args) {
        int[] arr = {15,18,2,3,6,12};
       int ans = findpivot(arr);
        System.out.println(ans+1);
    }

    static int findpivot(int [] arr){

        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }

            if(mid>start && arr[mid]<arr[mid+-1]){
                return mid-1;
            }

            if(arr[mid]<=arr[start]){
                end = mid-1;
            }

            else {
                start = mid+1;
            }

        }
        return -1;
    }

}
