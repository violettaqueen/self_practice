package leetcode;

public class FindIndexFirstOccurrenceInString28 {

    public static void main(String[] args) {

        String haystack= "sadbutsad";
        String needle = "sad";
        System.out.println(findIndex(haystack, needle));
    }
    public static int findIndex(String haystack, String needle){

       int nLength = needle.length();  //3

       if (nLength==0) return 0;

       int hLength=haystack.length(); //9

       if (hLength < nLength) return -1;
                               //6
        for (int i = 0; i <= hLength-nLength; i++) {

            if (haystack.substring(i, i+nLength).equals(needle)){
                return i;
            }
        }
        return -1;

    }
}
