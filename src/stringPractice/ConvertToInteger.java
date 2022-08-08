package stringPractice;

import java.util.InputMismatchException;

public class ConvertToInteger {

    public static int convertToInteger(String str) {
        int result = 0;
        int factorTo10 = 1;
        try {
            for (int i = str.length() - 1; str.startsWith("-") ? i > 0 : i >= 0; i--) {
                char each = str.charAt(i);
                result += (each - '0') * factorTo10;
                factorTo10 *= 10;
            }
        } catch (InputMismatchException e) {
            return 0;
        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(convertToInteger("123"));
    }


}
