package Daily_Leet_Code;

public class SplitaStringinBalancedStrings1221 {
    public static void main(String[] args) {
            String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
    public static int balancedStringSplit(String s) {
        if (s==null || s.length()==0){
            return 0;
        }
        int count = 0 , left = 0 , right = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'L') {

                left++;
            }
            else {
                right++;
            }
            if (left==right){
                count++;
            }
            
        }
        return count;
    }
}
