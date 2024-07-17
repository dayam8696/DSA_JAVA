package Daily_Leet_Code;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons1189 {
    public static void main(String[] args) {
        String  text = "nlaebolko";
        System.out.println(maxBallon(text));
    }
    public static int  maxBallon (String text){
        Map<Character,Integer> map = new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }

        }
        int min = map.get('b');
        min = Math.min(min,map.get('a'));
        min = Math.min(min,map.get('l')/2);
        min = Math.min(min,map.get('o')/2);
        min = Math.min(min,map.get('n'));
return min;
    }
}
