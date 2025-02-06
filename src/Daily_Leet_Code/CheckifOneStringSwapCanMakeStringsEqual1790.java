package Daily_Leet_Code;

public class CheckifOneStringSwapCanMakeStringsEqual1790 {
    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.length()!=s2.length()){
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i)==s2.charAt(j)){
                    return true;
                }
                else {
                    return false;
                }
            }

        }
      return true;
    }

    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(areAlmostEqual(s1,s2));
    }
}
