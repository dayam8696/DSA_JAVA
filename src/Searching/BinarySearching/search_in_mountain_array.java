package Searching.BinarySearching;

public class search_in_mountain_array {
    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);

    }

  static public   int search(int [] arr, int target){
        int peak =peakIndexInMountainArray(arr);
        int firstTry = AgnosticBinarySearch(arr,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }
return AgnosticBinarySearch(arr,target,peak+1,arr.length-1);

    }


        static public int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > arr[mid + 1]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }}
            return start;
        }



    static  public  int AgnosticBinarySearch(int[] arr, int target ,int start ,int end) {

        if (arr[start] < arr[end]) { // accending order
            while (start <= end) {
                // find the mid
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;

                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        } else if (arr[end] < arr[start]) {  // decending order
            while (start <= end) {
                // find the mid
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    end = mid - 1;

                }
                else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }

            }

        }
        return -1;
    }
    }



