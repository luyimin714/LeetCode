package Tree;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left == 0 || right == 0) ? left+right+1 : Math.min(left, right) + 1;
    }
//    public int minDepth(TreeNode root) {
//        if(root == null)
//            return 0;
//        int minDepth = 0;
//        return depth(root, minDepth);
//
//    }
//    public int depth(TreeNode node, int minDepth){
//        if(node == null)
//            return minDepth;
//        if(node.left == null && node.right == null)
//            return minDepth + 1;
//        int left = depth(node.left, minDepth);
//        int right = depth(node.right, minDepth);
//        return (left == 0 || right == 0) ? left + right + 1 : Math.min(depth(node.left, minDepth), depth(node.right, minDepth)) + 1;
//    }
}
