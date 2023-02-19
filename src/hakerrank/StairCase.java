package hakerrank;

public class StairCase {
    public static void main(String[] args) {
        int n = 4;
        staircase(n);
    }

    public static void staircase(int n) {



        for (int numSymbols = 1 ; numSymbols <= n; numSymbols++) {  //number of lines

            int numSpaces= n- numSymbols;

            for (int i = 0; i < numSpaces; i++) {

                System.out.print(" ");
            }
            for (int i = 0; i < numSymbols; i++) {
                System.out.print("#");
            }
            System.out.println();

        }

    }
}