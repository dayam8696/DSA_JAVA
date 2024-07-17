package Daily_Leet_Code;

public class CountPrime204 {
    public static void main(String[] args) {
        System.out.println(CountPrime(10));
    }

    public static int CountPrime(int n){
        int result = 0;
        if (n<2){
            return 0;
        }
        int [] isPrime = new int[n];
        for (int i = 2; i*i <n ; i++) {
            if (isPrime[i]==0){
                for (int j = i*i; j < n; j=j+i) {
                    isPrime[j]=1;
                }

            }

        }
        for (int i = 2; i < n; i++) {
            if (isPrime[i]==0){
                result++;
            }

        }
        return result;
    }
}
