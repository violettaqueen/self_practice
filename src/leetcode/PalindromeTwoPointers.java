package leetcode;

public class PalindromeTwoPointers {

    public boolean isPalindrome(String s){

        int p1=0;
        int p2=s.length()-1;

        while (p1<=p2){
            if (s.charAt(p1) != s.charAt(p2)){
                return false;
            }
            p1++;
            p2--;
        }
        return true;

    }
}
