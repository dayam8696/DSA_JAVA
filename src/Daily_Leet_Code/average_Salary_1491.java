package Daily_Leet_Code;

public class average_Salary_1491 {
    public static void main(String[] args) {
        int [] arr = {4000,3000,1000,2000};
        System.out.println(average(arr));
    }

    public static double average(int[] salary) {
            double max = salary[0];
            double min = salary[0];
            double sum = 0;
        for (int i = 0; i <salary.length ; i++) {
            if (salary[i]>max){
                max = salary[i];

            }
            if (salary[i]<min){
                min = salary[i];
            }
        }
        for (int i = 0; i < salary.length; i++) {
            if (salary[i]!=max && salary[i]!=min){
                sum = sum + salary[i];
            }

        }

        return sum / (salary.length-2);
    }
}
