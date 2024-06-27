package Recursion_Level_1;

public class SumOfN_Nmubers {
    public static void main(String[] args) {
        int ans = sumof(5);
        System.out.println(ans);
    }

    static int sumof(int n){
        if (n<=1){
            return 1;
        }
        return n + sumof(n-1);
    }
}
