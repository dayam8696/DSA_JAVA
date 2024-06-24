package MathsForDSA;

public class FactorOfTheNumber {
    public static void main(String[] args) {
        int n = 20;
        FactorOf2(n);
    }

   static void FactorOf(int n) {
       for (int i = 1; i <=n ; i++) {
           if (n%i==0) {
               System.out.println(i + " ");


           }
       }
    }

    static void FactorOf2(int n) {
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if (n%i==0) {
                if (n/i==i){
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " " + n/i + " ");
                }



            }
        }
    }
}
