package leetcode;

public class PalindromeNumber9 {

    public static void main(String[] args) {

        int x = -121;

        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int num) {

        String s = String.valueOf(num);
        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 <= p2) {
            if (s.charAt(p1) != s.charAt(p2)) {
                return false;

            }
            p1++;
            p2--;
        }
        return true;

    }
}
