package StringBuffer;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

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

        int size = 20;
        String name = RandomString.generate(size);
        System.out.println(name);

        // remove whiteSpaces

        String sentence = "Hi h hija jdfjsdj  dfnklsa    ew";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s",""));

        // Split

        String arr = "kunal, Apoorv, Rahul, Snehal";
        String []names = arr.split("  ");
        System.out.println(Arrays.toString(names));

        //Round OFF
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println(df.format(7.29));


    }
}
