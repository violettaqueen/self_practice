package leetcode;

public class RangeSumOfBST938 {


    public int rangeSumBST(TreeNode root, int low, int high) {

        int result = 0;
        if (root == null) return result;

        if (root.val == low || root.val == high || root.val > low && root.val < high) {

            result += root.val;
        }
        rangeSumBST(root.left, low, high);
        rangeSumBST(root.right, low, high);

        return result;

    }
}
