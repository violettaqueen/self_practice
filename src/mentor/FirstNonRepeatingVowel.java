package mentor;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingVowel {
    public static void main(String[] args) {
        String word="google";
        System.out.println(firstNonRepeatingVowelMap(word));
    }

    public static int firstNonRepeatingVowelMap(String str){

        Map<Character, Integer> letters=new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);

            if (ch=='a'||ch=='o'||ch=='e'||ch=='u'||ch=='y'||ch=='i'){
                if (!letters.containsKey(ch)){
                    letters.put(ch, i); //ch , index
                }else{
                    letters.put(ch, -1);
                }
            }
        }
        for (Integer eachValue: letters.values()){
            if (eachValue >= 0){
                return eachValue;
            }
        }
        return -1;
    }
}
