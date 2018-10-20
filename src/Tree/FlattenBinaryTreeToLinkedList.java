package Tree;

import java.util.LinkedList;
import java.util.List;

public class FlattenBinaryTreeToLinkedList {
    private TreeNode prev = null;
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
