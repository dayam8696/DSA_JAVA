package BigIntegers;

import java.math.BigInteger;

public class LargeNumbers {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;
        BigInteger A= BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(3456789);
        BigInteger C = new BigInteger("1234567891234");
        //constant
        BigInteger D = BigInteger.TEN;
        //addition
        BigInteger s = A.add(B);
        //multiple
        BigInteger m =A.multiply(B);
        //subtract
        BigInteger sub = A.subtract(B);

        // Reminder
        BigInteger rem = B.remainder(A);


        System.out.println(s);
        System.out.println(C );
        System.out.println(m);
        System.out.println(sub);
        System.out.println(rem);

        if (A.compareTo(B)>0){
            System.out.println("yes");
        }
        System.out.println(fact(300));

    }
    public static BigInteger fact (int nums){
        BigInteger ans =  new BigInteger("1");
        for (int i = 2 ; i<=nums ; i++) {
            ans= ans.multiply(BigInteger.valueOf(i));

        }
        return ans;
    }
}
