package BitWise_Operator_Number_System;

public class CheckingBinaryNumberAsPowerof2 {
    public static void main(String[] args) {
     int n = 16;
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
}
