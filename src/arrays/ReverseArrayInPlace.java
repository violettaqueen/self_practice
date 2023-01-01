package arrays;

import java.util.Arrays;

public class ReverseArrayInPlace {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(nums)));
    }
    public static int[] reverse(int[] nums){

        int lowIndex = 0;
        int highIndex = nums.length-1;
        while (lowIndex < highIndex){
             swap(nums,lowIndex,highIndex);
             lowIndex++;
             highIndex--;
        }
        return nums;
    }
    public static void swap(int[] nums, int lowIndex, int highIndex){

        int temp = nums[lowIndex];
        nums[lowIndex]=nums[highIndex];
        nums[highIndex]= temp;

    }
}
