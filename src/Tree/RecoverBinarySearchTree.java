package Tree;

public class RecoverBinarySearchTree {
    TreeNode firstElement = null, secondElement = null;
    TreeNode preElement = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        traverse(root);
        int temp = firstElement.val;
        firstElement.val = secondElement.val;
        secondElement.val = temp;
    }

    private void traverse(TreeNode root){
        if (root == null)
            return;
        traverse(root.left);

        if (firstElement == null && preElement.val >= root.val)
            firstElement = preElement;
        if (firstElement != null && preElement.val >= root.val)
            secondElement = root;
        preElement = root;

        traverse(root.right);
    }
}
