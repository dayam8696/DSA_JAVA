package StringBuffer;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Dayam Nadeem");
        StringBuffer sb3 = new StringBuffer(32);
        sb.append("Dayam is an Android Developer");
        sb.append(" from india");
        sb.insert(5," Nadeem");
        sb.replace(0,4 ,"DAYA");
        sb.reverse();
       // sb.delete(8,10);

      String str = sb.toString();
        System.out.println(str);


    }
}
