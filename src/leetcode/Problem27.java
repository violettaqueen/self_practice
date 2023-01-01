package leetcode;

public class Problem27 {

    public static void main(String[] args) {

        int[] nums = {3,2,2,3};
        int value = 3;
        //System.out.println(removeElementForLoop(nums, value));
        System.out.println(removeElementsWhileLoop(nums, value));
    }
    public static int removeElementForLoop(int[] nums, int value){

        int totalElements= 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != value){
                nums[totalElements++] = nums[i]; //number of elements ++
            }
        }
        return totalElements;
    }
    public static int removeElementsWhileLoop(int[] nums, int value){

        int insertion = 0;
        int reader = 0;

        while (reader < nums.length){
            if (nums[reader] != value){
                nums[insertion++] = nums[reader++];
            } else {
                reader++;
            }
        }
        return insertion;
    }
}
