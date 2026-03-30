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
    int max = 1;
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int a =help(root,1);
        return a;
    }
    public int help(TreeNode root , int count){
        if(root == null){
            return 0;
        }
        max = Math.max(count , max);
         help(root.left , count + 1);
         help(root.right , count + 1);

         return max;
    }

}
