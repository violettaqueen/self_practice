package stringPractice;

public class PalindromeWhile2 {

    public boolean isPalindrome(String s) {

        int forward = 0;
        int backwards = s.length() - 1;

        while (forward < backwards) {

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(forward) != s.charAt(backwards)) {
                    return false;
                }
                forward++;
                backwards--;
            }

        }
        return true;
    }
}