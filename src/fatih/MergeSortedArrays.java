package fatih;

import java.util.Arrays;
import java.util.List;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        System.out.println(Arrays.toString(mergeArrays(nums1, nums2, m, n)));
        System.out.println(Arrays.toString(mergeArrays2(nums1, nums2, m, n)));
        //System.out.println(Arrays.toString(mergeArrays3(nums1, nums2, m, n)));
    }

    public static int[] mergeArrays(int[] nums1, int[] nums2, int m, int n) {
        // set the pointer for nums2 array
        int k = 0;
        // loop starts from m - elements to be merged, through the length of array m+n
        for (int i = m; i < m + n; i++) {
            // assign elements nums2 to nums1 starting from index 3
            nums1[i] = nums2[k++];
        }
        // sort array
        Arrays.sort(nums1);
        return nums1;
    }

    public static int[] mergeArrays2(int[] nums1, int[] nums2, int m, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int j = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[j--] = nums1[p1--];
            } else {
                nums1[j--] = nums2[p2--];
            }
        }
        return nums1;
    }

//    public static int[] mergeArrays3(int[] nums1, int[] nums2, int m, int n) {
//
//
//    }
}