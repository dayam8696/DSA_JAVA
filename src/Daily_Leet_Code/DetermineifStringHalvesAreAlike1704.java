package Daily_Leet_Code;

public class DetermineifStringHalvesAreAlike1704 {
    public static boolean halvesAreAlike(String s) {
            s = s.toLowerCase();
            String a = s.substring(0,s.length()/2);
            String b = s.substring(s.length()/2);
            int aCount = CountVowels(a);
            int bCount = CountVowels(b);
            if (aCount==bCount){
                return true;
            }
            return false;
    }

    private static int CountVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
}
