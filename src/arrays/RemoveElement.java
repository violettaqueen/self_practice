package arrays;

public class RemoveElement {

    public int removeElement(int[]nums, int value){

        int total=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != value ){
                nums[total++]=nums[i];
            }
        }
        return total;
    }
}
