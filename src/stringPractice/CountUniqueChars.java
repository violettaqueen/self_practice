package stringPractice;

public class CountUniqueChars {

    public static void main(String[] args) {

        String str = "abccc";
        int count = 0;

        for (int j = 0; j < str.length(); j++) {
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }
            if(frequency == 1){
                count ++;
            }
        }
        if(count == 0){
            System.out.println(-1);
        }
        System.out.println(count);
    }
}
 /*
Write a Java program to count unique Characters in string.
Given a string as input, write Java code to count and print the number of unique characters in String.
If there are no unique characters in the string, the method returns -1
*/