package arrays;

import java.util.Arrays;

public class ReverseArray2 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};
        //System.out.println(Arrays.toString(reverseArrayInPlace(nums)));
        System.out.println(Arrays.toString(reverseArrayInPlace2(nums)));

    }

    public static int[] reverseArrayInPlace(int[] nums) {

        //3
        for (int i = 0; i < nums.length / 2; i++) {

            int other = nums.length - i - 1;  // index 5 (6)
            int temp = nums[i];  //1
            nums[i] = nums[other];
            nums[other] = temp;
        }
        return nums;
    }

    public static int[] reverseArrayInPlace2(int[] nums) {

        for (int i = 0; i < nums.length / 2; i++) {

            int temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
        return nums;
    }
}
