package mentor;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "adhfgrtevcfdgfsfdffg";
        System.out.println(frequency(str));

    }
    public static Map<Character, Integer> frequency(String str){

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        return map;
    }

}
