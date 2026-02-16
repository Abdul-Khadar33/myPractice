import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTree {

    public List<List<Integer>> ListNode(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        pre(root, 0, al);
        return al;
    }

    public static void pre(TreeNode root, int level, List<List<Integer>> al) {

        if (root == null)
            return;

        if (al.size() == level) {
            List<Integer> li = new ArrayList<>();
            li.add(root.val);   
            al.add(li);
        } else {
            al.get(level).add(root.val);  
        }

        pre(root.left, level + 1, al);
        pre(root.right, level + 1, al);
    }

    public static void main(String args[]) {

        BinaryTree b = new BinaryTree();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = b.ListNode(root);

        System.out.println(result);
    }
}
