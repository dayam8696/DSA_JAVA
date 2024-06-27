package Recursion_Level_1;

public class Sum_Of_Digits {
    public static void main(String[] args) {
        int n = 1342;
        int ans = DigitSum(n);
        System.out.println(ans);
    }

    static int DigitSum(int n) {
        if (n==0){
            return 0;
        }
        return DigitSum(n/10) +(n%10);
    }
}
