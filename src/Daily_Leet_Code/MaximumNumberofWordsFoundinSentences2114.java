package Daily_Leet_Code;

public class MaximumNumberofWordsFoundinSentences2114 {
    public static void main(String[] args) {
        String []arr = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(arr));

    }
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences){
            int len = sentence.split(" ").length;
            max = Math.max(max,len);
        }
        return max;
    }
}
