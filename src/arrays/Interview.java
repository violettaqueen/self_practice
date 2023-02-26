package arrays;

import java.util.Arrays;

public class Interview {

    public static void main(String[] args) {

        //Java program to print the elements of an array present on even position
        int[] nums = {1,2,3,4,5,6,7,};
        System.out.println(Arrays.toString(evenNumbers(nums)));


    }
    public static int[] evenNumbers(int[] nums){

        //[1,2,3,4,5,6,]
        int lowIndex=0;
        int highIndex=nums.length-1;

        while (lowIndex < highIndex) {

            while (nums[lowIndex] % 2 == 0 && lowIndex < highIndex) {
                lowIndex++;

                while (nums[highIndex] % 2 == 1 && lowIndex < highIndex) {
                    lowIndex--;

                    if (lowIndex < highIndex) {

                        int temp = nums[lowIndex];
                        nums[lowIndex] = nums[highIndex];
                        nums[highIndex] = temp;
                        lowIndex++;
                        highIndex--;
                    }
                }
            }
        }

return nums;

    }

}
//    int left = 0, right = arr.length - 1;
//        while (left < right)
//        {
//        /* Increment left index while we see 0 at left */
//        while (arr[left]%2 == 0 && left < right)
//        left++;
//
//        /* Decrement right index while we see 1 at right */
//        while (arr[right]%2 == 1 && left < right)
//        right--;
//
//        if (left < right)
//        {
//        /* Swap arr[left] and arr[right]*/
//        int temp = arr[left];
//        arr[left] = arr[right];
//        arr[right] = temp;
//        left++;
//        right--;
//        }
//        }