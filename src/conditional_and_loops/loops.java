package conditional_and_loops;

import java.util.Scanner;

public class loops {
    /*
         Syntax of for loops:

         for (initialisation; condition; increment/decrement) {
             // body
         }
     */
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf(i + " ");

        }


        // while loops
        /*
            Syntax:
            while (condition) {
                // body
            }
         */

        int b = 1;
        while (b <= 5) {
            System.out.printf(b + " ");
            b++;
        }

        // do while
        /*

            do {
                // body
            } while (condition);

         */
        int l = 1;
            do {
                System.out.println(b);
                b++;
            }  while (l<=5);

            // see it will execute at least one time
             int i = 1;
            do{
                System.out.println("Hello world");
            }while(i!=1);
    }
}
