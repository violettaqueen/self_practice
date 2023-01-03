package arrays;

public class ReverseArrayInPlace2 {

    public int[] reverse(int[] nums){  //{1,2,3,4,5}

        int lowIndex=0;
        int highIndex= nums.length-1;

        while(lowIndex<highIndex){
            swap(nums,lowIndex,highIndex);
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
