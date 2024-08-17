package Daily_Leet_Code;

public class JewelsandStones771 {
    public static void main(String[] args) {
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels1,stones1));

    }
    public static int numJewelsInStones(String jewels, String stones) {

        int count = 0;


        for (int i = 0; i < stones.length(); i++) {

            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
