package leetcode;

public class PalindromeOnePointer {

    public boolean isPalindrome(String s){

        int p1 = s.length()-1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(p1)){
                return false;
            }
            p1--;
        }
        return true;
    }
}
