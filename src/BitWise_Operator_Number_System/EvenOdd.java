package BitWise_Operator_Number_System;

public class EvenOdd {
    public static void main(String[] args) {
        int n = 67;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n){
        return (n & 1)==1;
    }
}
