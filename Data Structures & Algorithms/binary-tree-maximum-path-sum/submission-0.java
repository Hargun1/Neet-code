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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        help(root);
       return max; 
    }
    public int help(TreeNode root ){
        if(root == null){
            return 0;
        }
        int left = help(root.left);
        int right = help(root.right);

        left = Math.max(0,left);
        right = Math.max(0,right);

        int sum = left + right + root.val;
         max = Math.max(sum , max);

        return root.val + Math.max(right , left);
    }
}
