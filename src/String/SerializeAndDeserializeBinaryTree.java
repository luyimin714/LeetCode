package String;

import Tree.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SerializeAndDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.substring(0, sb.length() - 1);
    }

    private void buildString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null").append(",");
        } else {
            sb.append(node.val).append(",");
            buildString(node.left, sb);
            buildString(node.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList(data.split(",")));
        return buildTree(list);
    }

    private TreeNode buildTree(List<String> list) {
        String s = list.remove(0);
        if (s.equals("null"))
            return null;
        else {
            TreeNode node = new TreeNode(Integer.valueOf(s));
            node.left = buildTree(list);
            node.right = buildTree(list);
            return node;
        }
    }
}
