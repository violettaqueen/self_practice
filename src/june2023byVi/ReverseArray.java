package june2023byVi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {
        List<Integer>nums = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(reverseArray(nums));

    }

    public static List<Integer> reverseArray(List<Integer> nums) {  //1,2,3

        for (int i = 0; i < nums.size(); i++) {
            Collections.reverse(nums);
        }

        return nums;

    }
}
