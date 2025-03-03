package Daily_Leet_Code;

public class AssignCookies455 {
    public static int findContentChildren(int[] g, int[] s) {
        int count = 0 ;
        for (int i = 0; i < s.length; i++) {
            for (int j = i ; j< s.length ;j++)
            if (s[i]>=g[i]){
                count++;
                i++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int [] g = {1,2};
        int [] s = {1,2,3};
        System.out.println(findContentChildren(g,s));
    }
}
