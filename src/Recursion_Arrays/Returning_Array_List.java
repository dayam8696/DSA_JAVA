package Recursion_Arrays;

import java.util.ArrayList;

public class Returning_Array_List {
    public static void main(String[] args) {
        int arr [] = {2,1,3,4,4,5};
        ArrayList<Integer> ans = findAllIndex(arr,4,0,new ArrayList<Integer>());
        System.out.println(ans);
    }

     static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index==arr.length){
            return list;

        }
        if (arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
}
