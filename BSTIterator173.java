import java.util.ArrayList;
import java.util.Stack;
class BSTIterator173{
    public class TreeNode {
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
 
    private  ArrayList<Integer> al = new ArrayList<>();
    class BSTIterator {

        private Stack<TreeNode> stack = new Stack<>();

        public BSTIterator(TreeNode root) {
            pushAllLeft(root);
        }

        public int next() {
            TreeNode node = stack.pop();

            if (node.right != null) {
                pushAllLeft(node.right);
            }
            
            return node.val;
        }

        public boolean hasNext() {
            return !stack.isEmpty();
        }
        
        private void pushAllLeft(TreeNode node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
    }
}