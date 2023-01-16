package stringPractice;

public class Main {

    public static void main(String[] args) {

        Palindrome isPalindrome = new Palindrome();
        System.out.println(isPalindrome.isPalindrome("Madam".toLowerCase()));

        PalindromeWhile problem = new PalindromeWhile();
        System.out.println(problem.isPalindrome("racecar"));

        Anagram3 problem3=new Anagram3();
        System.out.println(problem3.isAnagram("Dormitory".toLowerCase().toCharArray(), "dirtyroom".toLowerCase().toCharArray()));

        PalindromeWhile2 problem4= new PalindromeWhile2();
        System.out.println(problem4.isPalindrome("violetta".toLowerCase()));
    }
}
