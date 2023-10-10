package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_Arrays {
    public static void main(String[] args) {
        /*
        123
        456
        789
         */
        Scanner in = new Scanner(System.in);
        int [][]arr = new int[3][3];
//        int[][] arr2 = {{4,5,6} ,{7,8,9} , {10,11,12}};
//        System.out.println(arr2[1][2]);

        //Taking Input
        for (int row = 0 ; row<arr.length;row++){
            for(int col = 0; col<arr[row].length ;col++){
                arr[row][col]= in.nextInt();
            }
        }
        //Output
        for (int row = 0 ; row<arr.length;row++){
            for(int col = 0; col<arr[row].length ;col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }

        // Second method for printing out the 2D Array

        for (int row = 0 ; row< arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        // Using enhanced for loop

        for (int [] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
