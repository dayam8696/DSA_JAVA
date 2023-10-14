package Searching;

public class Linear_Searching {
    public static void main(String[] args) {
        int [] arr = {2,3,66,34,99};
        int ans = Linear_Search(arr , 34);
        boolean ans2 = LinearSearch(arr , 34);
        System.out.println("Element found at Index no : " +ans);
        System.out.println("Element found : " +ans2);

    }

   static int Linear_Search(int [] arr , int target) {
        if(arr.length==0){
            return -1;
        }
        // searching element
       for (int index = 0; index < arr.length; index++) {
           int element = arr[index];
           if (element==target){
               return index;
           }

       }
       // if element not found in Array
       return -1;
   }

   // boolean
   static boolean LinearSearch(int [] arr , int target) {
       if(arr.length==0){
           return false;
       }
       // searching element
       for (int index = 0; index < arr.length; index++) {
           int element = arr[index];
           if (element==target){
               return true;
           }

       }
       // if element not found in Array
       return false;
   }
   }



