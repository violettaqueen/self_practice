package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

    public static void main(String[] args) {

        int[]nums = {2,7,11,15};
        int target = 0;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) { //2,7,11,15

            if (map.containsKey(target-nums[i])){  //if key=2

                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }


}
