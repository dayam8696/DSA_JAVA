package Daily_Leet_Code;

public class ReverseString541 {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        int k1 = 2;
        System.out.println(reverseStr(s1, k1));
    }
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int start = 0; start < s.length(); start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, s.length() - 1);
            while (i < j) {
                char temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
        return new String(arr);
    }
}
