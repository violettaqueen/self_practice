package numbers;

public class Product {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        foo(nums);
    }
    public static void foo(int[] nums){

        int sum = 0;
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            sum+= nums[i];
        }
        for (int i = 0; i < nums.length ; i++) {
            product *= nums[i];
        }
        System.out.println(sum+", "+ product);
    }
}
