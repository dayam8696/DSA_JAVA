package conditional_and_loops.loops_questions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // TAKE INPUT FROM USER TILL USER DOES NOT PRESS 'X' OR 'x'
        System.out.println("Enter the operator");
        char op = in.next().trim().charAt(0);
        int ans = 0;
        while (true) {
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two number
                System.out.println("Enter the first numbers");
                int num1 = in.nextInt();
                System.out.println("Enter the Second  numbers");
                int num2 = in.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }

                }
                if (op == '%') {
                    ans = num1 % num2;

                }
            } else if (op=='X' || op=='x') {
                System.out.println("Thans for using ");
                    break;
            }
            else {
                System.out.println("Invalid Operation!!");
                break;
            }
            System.out.println("Equals " +ans);
        }
    }
}
