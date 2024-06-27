package Recursion_Level_1;

public class Pass_The_Number {
    public static void main(String[] args) {
        int n = 5;
        Pass(n);
    }

    static void Pass(int n){
        if (n==0){
            return ;
        }
        System.out.println(n);
        // Pass(n--) --> Wrong
        Pass(--n);
    }
}
