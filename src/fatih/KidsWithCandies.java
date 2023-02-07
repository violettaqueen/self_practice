package fatih;

import java.util.ArrayList;
import java.util.List;

class KidsWithCandies {
    public static void main(String[] args) {

        int[] candies = {2, 3, 5, 1, 3};
        int extraCandy = 3;
        System.out.println(kidsWithCandies(candies, extraCandy));
        System.out.println(kidsWithCandies2(candies, extraCandy));

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>(candies.length);
        int max = 0;
        for (int eachCandy : candies) {
            max = Math.max(eachCandy, max);
        }
        for (int eachCandy : candies) {
            result.add(eachCandy + extraCandies >= max);
        }
        return result;
    }

    public static List<Boolean> kidsWithCandies2(int[] candies, int extraCandy) {

        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            max = Math.max(candies[i], max);
        }
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandy >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

}
