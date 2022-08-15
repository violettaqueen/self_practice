package codeWars;

public class Accum {

    public static void main(String[] args) {

        String str = "abcd";

        for (int i = 0; i < str.length(); i++) {
           char[] ch = str.toCharArray();
           char each = str.charAt(i);


        }
        System.out.println(str);
    }

}
/*
This time no story, no theory. The examples below show you how to write function accum:

Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
 */