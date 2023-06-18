package june2023byVi;

public class LexicographicallyLarger {
    public static void main(String[] args) {


        String word = "hello";
        String word2 = "java";
        int d = word.compareTo(word2);

        if(word.compareTo(word2)<=0)
            System.out.println("No");
        else
            System.out.println("Yes");

    }
}