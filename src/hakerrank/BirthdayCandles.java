package hakerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BirthdayCandles {

    public static void main(String[] args) {

        int[] candles = {4, 4, 1, 3};
        List<Integer> list = Arrays.asList(4, 4, 1, 3);
        System.out.println(birthdayCandles(candles));
        System.out.println(birthdayCake2(list));
    }

    public static int birthdayCandles(int[] arr) {

        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            if (max == arr[i])
                count++;
        }
        return count;
    }

    public static int birthdayCake2(List<Integer> list) {

        int count = 0;
        int max = list.get(0);

        for (Integer each : list) {
            if (each >= max)
                max = each;
            if (max==each)
                count++;
        }
        return count;
    }
}
