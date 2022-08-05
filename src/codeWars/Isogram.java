package codeWars;

import java.util.Arrays;
import java.util.Collections;

public class Isogram {

    public static boolean isIsogram(String str){
      String result = "";
      int count = 0;

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(j) == ch) {
                    frequency++;
                }
            }
            if(result.contains(ch+"")){
                continue;
            }else{
                result += ch+"";
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "Dermatoglyphics";
        System.out.println(isIsogram("aba"));

    }
}
/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true
"aba" --> false
"moOse" --> false (ignore letter case)
 */