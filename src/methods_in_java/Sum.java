package methods_in_java;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();

    }
    static void sum (){
        Scanner in = new Scanner(System.in);
        int num1 , num2 , sum;
        System.out.println("Enter the first number ");
        num1 = in.nextInt();
        System.out.println("Enter the second number ");
        num2 = in.nextInt();
        sum = num1+num2;
        System.out.println("The sum is :" + sum);
    }
}
