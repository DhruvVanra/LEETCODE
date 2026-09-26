
import java.util.Stack;

class TreeNode {
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
class flatten114{
    public void flatten(TreeNode root) {
        Stack<Integer> st = new Stack<>();
        helper(root, st);
        Stack<Integer> st2 = new Stack<>();
        while(!st.empty()){
            st2.add(st.pop());
        }
        helper1(root, st2);
    }

    public static void helper(TreeNode root,Stack<Integer> st){
        if (root == null){
            return;
        }
        st.push(root.val);
        helper(root.left, st);
        helper(root.right, st);
    }

    public static void helper1(TreeNode root,Stack<Integer> st){
        st.pop();
        while(!st.empty()){
            TreeNode next = st.pop();
            root.left = null;
            root.right = next;

            root = root.right;
        }
    }
}