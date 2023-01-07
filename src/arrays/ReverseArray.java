package arrays;

public class ReverseArray {

    public int[] reverse(int[]nums){

        int lowIndex=0;
        int highIndex= nums.length-1;

        while (lowIndex<highIndex){
            swap(nums, lowIndex, highIndex);
            lowIndex++;
            highIndex--;
        }
        return nums;


    }
    public static void swap(int[]nums, int i, int j){

        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
