package mentor;

import java.util.*;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String s="google";
        System.out.println(frequencyOfChars(s));
    }

    public static Map<String, Integer> frequencyOfChars(String str){

        Map<String, Integer> map= new LinkedHashMap<>();

        for (String each:str.split("")){
            int frequency= Collections.frequency(Arrays.asList(str.split("")),each);
            map.put(each, frequency);
        }
        return map;
    }
}
