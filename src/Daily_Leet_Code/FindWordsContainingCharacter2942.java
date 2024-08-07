package Daily_Leet_Code;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter2942 {
    public static void main(String[] args) {
        String [] words = {"leet" , "code"};
        char ch = 'e';
        System.out.println(findWordsContaining(words ,ch));
    }
    public static List<Integer> findWordsContaining(String[] words, char x){
        List<Integer> resultWords = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (char ch : words[i].toCharArray()){
                if(ch==x){
                    resultWords.add(i);
                    break;
                }
            }

        }
        return resultWords;
    }
}
