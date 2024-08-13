package Daily_Leet_Code;

public class CheckIfTwoStringArraysareEquivalent1662 {
    public static void main(String[] args) {
        String [] word1 = {"ab", "c"};
        String [] word2 ={"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        StringBuilder wf1 = new StringBuilder();
        StringBuilder wf2 = new StringBuilder();

        for (String s : word1) {
            wf1.append(s);
        }
        for (String s : word2) {
            wf2.append(s);
        }

        return wf1.toString().equals(wf2.toString());
    }
}
