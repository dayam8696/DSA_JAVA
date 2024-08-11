package Daily_Leet_Code;

public class DefanginganIPAddress1108 {
    public static void main(String[] args) {
       String address = "1.1.1.1";
        System.out.println( defangIPaddr(address));
    }
    public static String defangIPaddr(String address){
        StringBuilder sb = new StringBuilder();
        char chars[] = address.toCharArray();
        for (char ch :chars){
            if (ch =='.'){
                sb.append("[.]");
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

}
