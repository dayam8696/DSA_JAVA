package Recursion_Arrays;

public class Find_Element_Linear_Search {
    public static void main(String[] args) {
        int arr [] = {1,5,3,9,18,4};
        int target = 9;
        System.out.println(Find(arr , target ,0));
    }

    private static boolean Find(int[] arr, int target, int index) {
        if (index==arr.length){
            return false;
        }
        return arr[index]==target || Find(arr,target,index+1);
    }
}
