package Daily_Leet_Code;

public class problem1455 {
    public static void main(String[] args) {
        String sentence = "i love eating burger" ;
        String searchwords = "burg";
        System.out.println(checkPrefix(sentence,searchwords));
    }
    public static int checkPrefix(String sentence , String searchword){

        String [] sentences = sentence.split(" ");
        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].startsWith(searchword)){
                return i +1;
            }
        }
        return -1;
    }
}
