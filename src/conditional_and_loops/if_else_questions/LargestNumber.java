package conditional_and_loops.if_else_questions;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        //Q- Find the maximum number among three
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max =  a;
        if (b>max){
          max =b;
        }
        if (c>max){
        max = c;

        }
        System.out.println(max);
    }
}
