package numbers;

public class UnorderedPairs {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,6,7};
        printUnorderedPairs(nums);

    }
    public static void printUnorderedPairs(int[] nums){

        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                System.out.println(nums[i]+ ", "+ nums[j]);
            }
        }



    }
}
