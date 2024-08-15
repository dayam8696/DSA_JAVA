package Daily_Leet_Code;

public class LemonadeChange860 {
    public static void main(String[] args) {
        int[] bills1 = {5, 5, 5, 10, 20};
        System.out.println(lemonadeChange(bills1));  // Output: true


    }

    public static boolean lemonadeChange(int[] bills) {
        // Counters for $5 and $10 bills
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else if (bill == 20) {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
