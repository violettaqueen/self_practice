package stringPractice;

public class PalindromeWhile {

    public boolean isPalindrome(String s){

        int forward=0;
        int backward=s.length()-1;

        while (forward<backward){
           if( s.charAt(forward)!=s.charAt(backward)){
               return false;
           }
           forward++;
           backward--;
        }
        return true;
    }
}
