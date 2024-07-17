package Daily_Leet_Code;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
    public static void main(String[] args) {
        System.out.println(IsHappyMember(19));
    }
    public static boolean IsHappyMember(int n){
        Set<Integer> seen = new HashSet<>();
        while (!seen.contains(n)){
            seen.add(n);
            int sum = 0;
            while (n!=0){
                int temp = n%10;
                sum = sum+temp*temp;
                n =n/10;
            }
            n =sum;
        }
        return n==1;
    }

}
