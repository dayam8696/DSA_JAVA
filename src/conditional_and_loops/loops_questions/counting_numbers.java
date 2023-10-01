package conditional_and_loops.loops_questions;

import java.util.Scanner;

public class counting_numbers {
    public static void main(String[] args) {

//Q - counting the one particular number that  how many times its repating itself?
        int n = 13378;
        int count = 0;
        while(n>0){
            int rem = n%10;
            if (rem==3){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
