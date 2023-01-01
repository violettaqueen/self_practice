package stringPractice;

import java.util.Arrays;

public class Anagram2 {

    public static void main(String[] args) {
        System.out.println(isAnagram("Cat".toLowerCase().toCharArray(), "Tac".toLowerCase().toCharArray()));
    }

    public static boolean isAnagram(char[] s1, char[] s2) {

        // check the length
        if (s1.length != s2.length) return false;
        // sort the letters of strings O(n log n)
        Arrays.sort(s1);
        Arrays.sort(s2);
        // loop through all the letters and compare
        // O(n)
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != s2[i])
                return false;
        }
        return true;
    }
}
