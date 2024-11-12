package Daily_Leet_Code;

public class mostbeautifulitemforeachquery2070 {
    public static void main(String[] args) {
            String [] message = {"hello","programming","fun"};
            String [] bannedWords = {"world","programming","leetcode"};
        System.out.println(isSpamMessage(message,bannedWords));

    }


        public static boolean isSpamMessage(String[] message, String[] bannedWords) {
            int matchCount = 0;

            for (String word : message) {

                for (String bannedWord : bannedWords) {
                    if (word.equals(bannedWord)) {
                        matchCount++;
                        if (matchCount == 2) {
                            return true;
                        }
                        break;
                    }
                }
            }

            return false;
        }
    }



