package Daily_Leet_Code;

import java.util.Arrays;

public class ConverttheTemperature2469 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(36.50)));
    }
    public static double[] convertTemperature(double celsius){
        double [] answer = new double[2];
        double kalvin =  celsius + 273.15;
        double farenhiet = celsius * 1.80 + 32.00;
        answer[0] = kalvin;
        answer[1]= farenhiet;
        return answer;
    }
}
