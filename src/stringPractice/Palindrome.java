package stringPractice;

public class Palindrome {

    public boolean isPalindrome(String word) {  //O(n)

        int forward = 0;
        int backward = word.length() - 1;

        while (forward < backward) {
            if (word.charAt(forward) != word.charAt(backward)) {
                return false;
            }
            forward++;
            backward--;
        }
        return true;
    }
}
