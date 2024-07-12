package Daily_Leet_Code;

public class IsSubsequence392 {
    public static void main(String[] args) {
        System.out.println(subsequence("abc", "ahbgdc"));
    }
    static boolean subsequence(String s , String t){
        if (s.length()==0){
            return true;
        }
        int i = 0;
        int j = 0;

        while (i<s.length() && j<t.length()){
            if (s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        if (i==s.length()){
            return true;
        }
return false;
    }
}
