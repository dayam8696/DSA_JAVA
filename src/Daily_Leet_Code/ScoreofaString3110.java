package Daily_Leet_Code;



public class ScoreofaString3110 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "zaz";

        System.out.println("Score of '" + s1 + "': " + calculateScore(s1));

    }
    public static int calculateScore(String s){
        int score = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            int currentCharValue = s.charAt(i);
            int nextCharValue = s.charAt(i + 1);

            score = score + Math.abs(currentCharValue - nextCharValue);
        }
        return score;
    }

}
