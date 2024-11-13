package Searching.BinarySearching;


public class Agnostic_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 33, 45, 66, 78, 89, 99}; // acending order
        int[] arr1 = {99 ,89 ,78,66,45 ,33,11,9,6,4,2}; // decending order
        int target = 89;
        int ans2 = AgnosticBinarySearch(arr ,target);
        int ans= AgnosticBinarySearch(arr1 , target);
        System.out.println(ans);
        System.out.println(ans2);

    }

    static int AgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
