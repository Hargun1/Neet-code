/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int max = 0;
    public int maxDepth(TreeNode root) {
       return  help(root);
    }
    public int help(TreeNode root){
        if(root == null){
            return 0;
        }
      int left =  help(root.left);
      int right = help(root.right);

        max = Math.max(max , Math.max(right , left));

        return 1 + Math.max(left ,right);

    }
}
