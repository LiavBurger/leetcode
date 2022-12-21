import java.util.*;

public class BinaryTreeLevelOrderTraversal_102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList <List <Integer>> list = new ArrayList<>();
        recursionPreOrder(list, root, 0);
        return list;
    }

    private void recursionPreOrder (ArrayList<List<Integer>> list, TreeNode root, int index) {
        if (root == null)
            return;

        if(list.size() <= index)
            list.add(new ArrayList<Integer>());

        list.get(index).add(root.val);


        if (root.left != null) {
            recursionPreOrder(list, root.left, index+1);
        }
        if (root.right != null)
            recursionPreOrder(list, root.right, index+1);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
