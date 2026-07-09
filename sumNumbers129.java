import java.util.*;
class sumNumbers{

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public int sumNumbers(TreeNode root) {
        List<String> ans = new ArrayList<>();

        if (root == null)
            return 0;

        helper(root, "" + root.val, ans);
        int num = 0;
        for(String st : ans){
            num+= Integer.parseInt(st);
        }
        return num;
    }

    public void helper(TreeNode root, String str, List<String> ans) {

        if (root.left == null && root.right == null) {
            ans.add(str);
            return;
        }

        if (root.left != null){
            helper(root.left, str+root.left.val, ans);
        }

        if (root.right != null){
            helper(root.right, str+ root.right.val, ans);
        }
    }
}