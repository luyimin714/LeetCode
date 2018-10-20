package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new LinkedList<>();
        if(root == null)
            return list;
        searchBT(root, "", list);
        return list;
    }

    public void searchBT(TreeNode root, String path, List<String> list){
        if(root.left == null && root.right == null)
            list.add(path + root.val);
        if(root.left != null)
            searchBT(root.left, path + root.val + "->", list);
        if(root.right != null)
            searchBT(root.right, path + root.val + "->", list);
    }
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> list = new LinkedList<>();
//        Stack<TreeNode> node = new Stack<>();
//        Stack<String> path = new Stack<>();
//        if(root == null)
//            return list;
//        node.push(root);
//        path.push("");
//        while(!node.isEmpty()){
//            TreeNode temp = node.pop();
//            String curpath = path.pop();
//            if(temp.left == null && temp.right == null)
//                list.add(curpath + temp.val);
//            if(temp.left != null){
//                node.push(temp.left);
//                path.push(curpath + temp.val + "->");
//            }
//            if(temp.right != null){
//                node.push(temp.right);
//                path.push(curpath + temp.val + "->");
//            }
//        }
//        return list;
//    }
}
