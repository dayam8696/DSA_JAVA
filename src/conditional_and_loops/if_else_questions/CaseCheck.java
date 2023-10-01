package conditional_and_loops.if_else_questions;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        // Q- checking a Char wheather it is upper case or lower case?
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch>= 'a' && ch<='z'){
            System.out.println("Lower Case");
        }
        else {
            System.out.println("Upper case");
        }
    }
}
