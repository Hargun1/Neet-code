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
    int count;
    public int goodNodes(TreeNode root) {
        help(root,root.val);
        return count ;
    }
    public void help(TreeNode root  ,int v){
        if(root == null){
            return ;
        }

        if(root.val >=v){
            count++;
        }

        int max = Math.max(v,root.val);
        
        help(root.left , max);
        help(root.right, max);
    }

}
