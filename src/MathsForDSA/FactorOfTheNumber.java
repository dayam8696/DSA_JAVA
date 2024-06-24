package MathsForDSA;

import java.util.ArrayList;

public class FactorOfTheNumber {
    public static void main(String[] args) {
        int n = 20;
        FactorOf3(n);
    }

   static void FactorOf(int n) {
       for (int i = 1; i <=n ; i++) {
           if (n%i==0) {
               System.out.println(i + " ");


           }
       }
    }
// optimised
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

//optimised + accending
    static void FactorOf3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if (n%i==0) {
                if (n/i==i){
                    System.out.print(i + " ");
                }
                else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }



            }
        }
        for (int i = list.size() -1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");

        }
    }
}
