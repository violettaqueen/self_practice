package mentor;

public class UniqueCharacters {
    public static void main(String[] args) {
        String s="aaabvcrr";
        System.out.println(unique(s));
    }

    public static String unique(String s){

        String[] arr = s.split("");
        String unique="";
        for (int i = 0; i < arr.length; i++) {
            int num=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])){
                    num++;
            }

            }
            if (num==1){
                unique+=arr[i];
            }
        }
        return unique;
    }
}
