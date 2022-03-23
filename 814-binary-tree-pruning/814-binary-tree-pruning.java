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
    public TreeNode pruneTree(TreeNode root){

    if(root == null){
        return null;
    }
    
    TreeNode left_contains = pruneTree(root.left);
    TreeNode right_contains = pruneTree(root.right);

    if(left_contains == null){
        root.left = null;
    }
    if(right_contains == null){
        root.right = null;
    }

    if(root.val == 0 && left_contains == null && right_contains == null){
        return null;
    }    
        
    return root;
}

}