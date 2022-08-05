package stringPractice;

import java.util.Arrays;
import java.util.TreeSet;

public class Anagram {

    public static boolean anagram(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        String a1 = "";
        String a2 = "";

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (char each : ch1) {
            a1 += each;
        }
        for (char each : ch2) {
            a2 += each;
        }
        return a1.equals(a2);

    }
    public static boolean anagram2(String str1, String str2){

        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        return str1.equals(str2);
    }

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "cab";

        System.out.println(anagram(str1, str2));
    }

        }

 /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:
     */