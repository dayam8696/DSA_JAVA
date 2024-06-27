package Recursion_Level_1;

public class ReverserNumber {


    static int sum = 0;
    static void reverse(int n){
        if (n==0){
            return;
        }
        int rem = n%10;
        sum = sum *10+rem;
        reverse(n/10);
    }
    public static void main(String[] args) {
        int n = 1342;
        reverse(1342);
        System.out.println(sum);

    }

}
