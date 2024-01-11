package Sorting.Cyclic_sort;
// problem link - https://leetcode.com/problems/missing-number/description/
public class LeetCode_Missing_number {
    public static void main(String[] args) {
        int []arr = {4,0,2,1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    private static int  missingNumber(int[] arr) {
        int i = 0;
        while (i<arr.length){
            int correct = arr[i];
            if(arr[i]< arr.length && arr[i]!=arr[correct]){
                swap(arr ,i ,correct);}
            else {
                i++;
            }
        }

        //searching the number
        for (int index = 0 ;index< arr.length;index++){
            if (arr[index]!= index){
                return index;
            }


        }
        //case 2
        return arr.length;
    }

    static void swap (int [] arr ,int i , int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
