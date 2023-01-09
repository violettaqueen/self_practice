package mentor;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "aaabbccdhg";
        System.out.println(removeDup(s));
    }

    public static String removeDup(String s){

        String result="";
        for (int i = 0; i < s.length(); i++) {
            if (!result.contains("" + s.charAt(i))){
                result+="" + s.charAt(i);
            }
        }
        return result;

    }
}
