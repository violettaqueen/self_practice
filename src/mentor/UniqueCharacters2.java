package mentor;

import java.util.HashMap;

public class UniqueCharacters2 {

    public int uniqueChars(String s) {

        HashMap<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }

        }
        return -1;
    }
}
