package Daily_Leet_Code;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaximumSwap670 {
    public static void main(String[] args) {
        System.out.println(maximumSwap(2736));
    }
    public static int maximumSwap(int num) {

        String numberStr = Integer.toString(num);
        Integer[] numberArray = new Integer[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            numberArray[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        
        int temp = numberArray[0];
        numberArray[0] = numberArray[1];
        numberArray[1] = temp;

        int swappedNumber = 0;
        for (int digit : numberArray) {
            swappedNumber = swappedNumber * 10 + digit;
        }


        return swappedNumber;

    }
}
