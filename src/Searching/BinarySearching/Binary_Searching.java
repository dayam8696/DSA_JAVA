package Searching.BinarySearching;

public class Binary_Searching {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 33, 45, 66, 78, 89, 99};
       int[] arr1 = {99 ,89 ,78,66,45 ,33,11,9,6,4,2};
        int target = 6;
        int target2 = 89;
        int ans = BinarySearch(arr, target);
       int ans2 = Binary_Search(arr1 ,target2);
        System.out.println(ans);
       System.out.println(ans2);
    }

    // Array willbe in acending order
    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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

    // Array will be in decending order
    static int Binary_Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
        return  -1 ;

    }

}
