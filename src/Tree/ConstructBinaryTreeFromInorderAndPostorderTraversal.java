package Tree;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(0,inorder.length-1, 0, postorder.length-1, inorder, postorder);
    }

    public TreeNode helper(int inStart, int inEnd, int postStart, int postEnd, int[] inorder, int[] postorder){
        if (postEnd < 0 || inStart > inEnd)
            return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++){
            if (inorder[i] == root.val)
                inIndex = i;
        }
        root.left = helper(inStart, inIndex-1, postStart,postEnd-1-(inEnd-inIndex), inorder, postorder);
        root.right = helper(inIndex+1, inEnd, postEnd-1-(inEnd-inIndex), postEnd-1, inorder, postorder);
        return root;
    }
}
