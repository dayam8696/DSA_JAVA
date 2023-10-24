package Searching.LinearSearching;

public class Finding_min_and_max_element_2D_Array {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3} ,{4,5,6},{7,8,9}};
        System.out.println("Maximum value element in this array is " + max_value(arr));
        System.out.println("Minimum value element in this array is " + min_value(arr));
    }

    static int max_value(int[][] arr ){
        int max= Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 1 ; col<arr[row].length; col++){
                int element = arr[row][col];
                if (element>max){
                    max=element;

                }
            }

        }
        return max;
    }

    static int min_value(int[][] arr ){
        int min= Integer.MAX_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0 ; col<arr[row].length; col++){
                int element = arr[row][col];
                if (element<min){
                    min=element;

                }
            }

        }
        return min;
    }
}


