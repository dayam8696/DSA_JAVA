package Daily_Leet_Code;

public class SlowestKey1629 {
    public static void main(String[] args) {
        int[] releaseTimes1 = {9, 29, 49, 50};
        String keysPressed1 = "cbcd";
        System.out.println(slowestKey(releaseTimes1, keysPressed1));
    }
    public static  char slowestKey(int[] releaseTimes, String keysPressed) {

        int maxDuration = 0;
        char maxKey = 'a';
        for (int i = 0; i < releaseTimes.length; i++) {

            int duration;
            if (i == 0) {
                duration = releaseTimes[i];
            } else {
                duration = releaseTimes[i] - releaseTimes[i - 1];
            }


            if (duration > maxDuration || (duration == maxDuration && keysPressed.charAt(i) > maxKey)) {
                maxDuration = duration;
                maxKey = keysPressed.charAt(i);
            }
        }

        return maxKey;
    }
}
