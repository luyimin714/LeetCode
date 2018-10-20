package Tree;

public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;
        TreeNode root = helper(nums, 0, nums.length-1);
        return root;
    }

    public TreeNode helper(int[] num, int lo, int hi){
        if(hi < lo)
            return null;
        int mid = (lo + hi) / 2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = helper(num, lo, mid-1);
        root.right = helper(num, mid+1, hi);
        return root;
    }
}
