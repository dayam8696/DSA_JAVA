package methods_in_java;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int n = in.nextInt();
        boolean ans = isprime(n);
        System.out.println(ans);

    }

    static boolean isprime(int n ){
        if (n<=1){
            return false;
        }
        int c = 2;
        while(c*c <=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
