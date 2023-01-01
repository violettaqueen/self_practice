package leetcode;

public class Problem26_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] nums ={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicatesFromSortedArray(nums));
    }

    public static int removeDuplicatesFromSortedArray(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }

        }
        return j+1;
    }
}
