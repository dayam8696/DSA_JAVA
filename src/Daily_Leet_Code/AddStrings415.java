package Daily_Leet_Code;

public class AddStrings415 {
    public static void main(String[] args) {
       String num1 ="123";
       String num2 = "11";
        System.out.println(addStrings(num1,num2));

    }
    public static  String addStrings(String num1, String num2) {
        // Initialize variables
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        // Process each digit
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            // Add digit from num1 if available
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }

            // Add digit from num2 if available
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }

            // Update carry and result digit
            carry = sum / 10;
            result.append(sum % 10);
        }

        // Reverse the result to get the final answer
        return result.reverse().toString();
    }
}
