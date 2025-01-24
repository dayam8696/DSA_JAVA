import java.util.Arrays;

public class randomquestions {
    public static boolean check(int[] arr1,int[] arr2) {
        if (arr1.length!=arr2.length){
            return false;
        }else {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    return false;
                }
            }
        }


//        boolean result = false;
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                int array1 = arr1[i];
//                if (array1!=arr2[j]){
//                    result = false;
//                }
//                else {
//                    result = true;
//                }
//
//            }
//        }


        return true;

    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,2,2};
        int [] arr2 = {2,2,2,1};
        System.out.println(check(arr1,arr2));
    }


}
