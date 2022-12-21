
import java.util.*;

public class N_aryTreePreorderTraversal_589 {
    public List<Integer> preorder(Node root) {
        ArrayList <Integer> list = new ArrayList<>();
        recursionPreOrder(list, root);
        return list;
    }

    private void recursionPreOrder(ArrayList<Integer> list, Node root) {
        if (root == null)
            return;

        list.add(root.val);

        if(root.children != null) {
            for (int i=0; i<root.children.size() ; i++)
                recursionPreOrder(list, root.children.get(i));
        }
    }


    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
