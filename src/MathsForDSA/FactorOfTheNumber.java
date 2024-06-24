package MathsForDSA;

public class FactorOfTheNumber {
    public static void main(String[] args) {
        int n = 20;
        FactorOf(n);
    }

   static void FactorOf(int n) {
       for (int i = 1; i <=n ; i++) {
           if (n%i==0) {
               System.out.println(i + " ");


           }
       }
    }
}
