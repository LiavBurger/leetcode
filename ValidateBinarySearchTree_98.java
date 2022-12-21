public class ValidateBinarySearchTree_98 {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(34, new TreeNode(-6), new TreeNode());
        tree.left.left = new TreeNode(-21);

        System.out.println(isValidBST(tree));
    }

    public static boolean isValidBST(TreeNode root) {
        int maxLeft = -((int)Math.pow(2,31)-1);
        int maxRight = ((int)Math.pow(2,31)-1);

        return search(root, maxLeft, maxRight);
    }

    private static boolean search(TreeNode root, int maxLeft, int maxRight) {
        boolean left = false, right = false;

        if (root == null)
            return true;

        if (maxLeft < root.val && root.val < maxRight) {
            left = search(root.left, maxLeft, root.val);
            right = search(root.right, root.val, maxRight);
        }

        return left && right;
    }




    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}

