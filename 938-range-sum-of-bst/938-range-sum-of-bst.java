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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int range_sum = 0;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            if(curr != null){
                if(curr.val >= low && curr.val <= high){
                    range_sum += curr.val;
                }
                if(curr.left != null){
                    stack.push(curr.left);
                }
                if(curr.right != null){
                    stack.push(curr.right);
                }
            }
        }
        return range_sum;
    }
}