package Daily_Leet_Code;

public class NumberComplement476 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println(findComplement(num1));
    }
    public static int findComplement(int num) {

        int bitLength = Integer.toBinaryString(num).length();


        int mask = (1 << bitLength) - 1;


        return num ^ mask;
    }
    }

