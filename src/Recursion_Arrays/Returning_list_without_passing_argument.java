package Recursion_Arrays;

import java.util.ArrayList;

public class Returning_list_without_passing_argument {
    public static void main(String[] args) {
        int arr [] = {2,1,3,4,4,8};
        System.out.println(findAllIndex(arr ,4,0));
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        ArrayList<Integer>list = new ArrayList<>();
        if (index==arr.length){
            return list;

        }
        if (arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer>ansFromBelowCalls= findAllIndex(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
