package Recursion_Arrays;

public class Find_Element_Linear_Search {
    public static void main(String[] args) {
        int arr [] = {1,5,3,9,18,4};
        int target = 9;
        System.out.println(Find(arr , target ,0));
        System.out.println("The element is at index number : " + FindIndex(arr,target,0));
    }


    //Returining Boolean
    static boolean Find(int[] arr, int target, int index) {
        if (index==arr.length){
            return false;
        }
        return arr[index]==target || Find(arr,target,index+1);
    }

    // Returining exact index value
     static int FindIndex(int[] arr, int target, int index) {
        if (index==arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return FindIndex(arr,target,index+1);
    }
}
