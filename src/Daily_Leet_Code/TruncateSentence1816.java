package Daily_Leet_Code;

public class TruncateSentence1816 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s,k));
    }
    public static String truncateSentence(String s, int k){
        int len = s.length();
        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int index = 0 ;
        while (k!=0){
            sb.append(words[index] + "  ");
            index++;
            k--;
        }
        return sb.toString();
    }
}
