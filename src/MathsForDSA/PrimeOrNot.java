package MathsForDSA;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 5;

    }
    static Boolean isprime(int n){
        if (n <=1 ){
            return false;
        }

    int c = 2;
        while (c*c<=n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

}
