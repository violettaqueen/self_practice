package stringPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyOfChars {

    public static void main(String[] args) {

        String s = "DDDAACCCCCCB";
//        System.out.println(frequencyOfCharsTatianaBruteForce(s));
//        System.out.println(frequencyOfCharsMap(s));
//        System.out.println(frequencyOfCharsDiana(s));
//        System.out.println(frequencyOfCharsSortedDiana(s));
    }

    public static String frequencyOfCharsDiana(String s) {
        String result = "";

        int p1 = 0;
        int p2 = 0;
        int count = 0;

        while (p2 != s.length()) {
            if (s.charAt(p1) == s.charAt(p2)) {
                count++;
                p2++;
            } else {
                result += s.charAt(p1) + "" + count;
                count = 0;
                p1 = p2;
            }
        }
        result += s.charAt(p1) + "" + count;
        return result;
    }

    public static String frequencyOfCharsSortedDiana(String s) {

        //sort array
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        // store the chars
        String str = "";

        //create pointers a string to hold the result
        int p1 = 0;
        int p2 = 0;
        String result = "";
        int count = 0;

        //loop through each char
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }
            while (p2 != s.length()) {

                if (str.charAt(p1) == str.charAt(p2)) {
                    count++;
                    p2++;
                } else {
                    result += str.charAt(p1) + "" + count;
                    count = 0;
                    p1 = p2;
                }
            }
            result += str.charAt(p1) + "" + count;
        return result;
        }


    public static String frequencyOfCharsTatianaBruteForce(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
                if (result.contains("" + ch)) {
                    result += "" + ch + count;
                }
            }

        }

        return result;
    }

    public static String frequencyOfChars2(String s) {
        String result = "";


        return result;
    }

    public static Map<Character, Integer> frequencyOfCharsMap(String str) {

        Map<Character, Integer> result = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.put(ch, result.getOrDefault(ch, 0) + 1);
        }
        return result;
    }
}