package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int [] arr = new int[5];
        arr[0] = 55;
        arr[1] = 36;
        arr[2] = 93;
        arr[3] = 54;
        arr[4] = 90;
        //excessing one particular element from array -
        System.out.println(arr[4]);


//        // printing an Array
//        for (int i = 0; i < 5; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // taking in input from user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");

        }

        // Using inhance for loop  to print element of an arrays

        for (int num :arr ){// for every element in the array print the element
            System.out.print(num + " ");// here num represent the element in array

        }

        //VERY SIMPLE WAY TO PRINT ARRAYS IN JAVA IS WITHOUT USING FOR LOOP in one line :
        System.out.println(Arrays.toString(arr));

    }
}
