package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix14 {

    public static void main(String[] args) {

        String[] arr = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] words) {

        if (words.length == 0) return "";

        Arrays.sort(words);

        String firstWord = words[0]; //flower
        String lastWord = words[words.length - 1];  //flight
        String prefix = "";

        //find word with shortest length
        int minLength = Math.min(firstWord.length(), lastWord.length());  //flow

        for (int i = 0; i < minLength; i++) {  //4

            if (firstWord.charAt(i) == lastWord.charAt(i)) {
                prefix += firstWord.charAt(i);
            } else
                break;

        }
        return prefix;

    }
}
