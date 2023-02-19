package hakerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {

        List<List<Integer>> listOfLists = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(9, 8, 9));

        listOfLists.addAll(Arrays.asList(list1, list2, list3));
        System.out.println(diagonalDifference(listOfLists));
    }

    public static int diagonalDifference(List<List<Integer>> list) {

        int d1 = 0;
        int d2 = 0;

        for (int i = 0; i < list.size(); i++) {
            d1 += list.get(i).get(i);
        }
        for (int i = 0; i < list.size(); i++) {
            d2 += list.get(i).get(list.size() - (i + 1));
        }
        return Math.abs(d1 - d2);

    }
}
