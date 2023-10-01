package conditional_and_loops.loops_questions;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // using while loop
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count<=n){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
       System.out.println(b);

        // using for loop
        int input = in.nextInt();
        int p = 0;
        int q = 1;
        for (int i =2; i<=input ; i++ ){
            int tem = q;
            q=q+p;
            p =tem;
        }
        System.out.println(q);
    }
}
