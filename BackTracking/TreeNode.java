package BackTracking;

/**
 * Given the root of a Binary Search Tree (BST), return the minimum difference between the values of any two different nodes in the tree.
 */



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
    int previousValue = -1;
    int minimumValue = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inorderUtilMethod(root);
        return minimumValue;
    }
    public void inorderUtilMethod(TreeNode root){
        if(root==null)
            return;
        inorderUtilMethod(root.left);
        if(previousValue!=-1)
            minimumValue = Math.min(minimumValue,root.val-previousValue);
        previousValue = root.val;
        inorderUtilMethod(root.right);
    }
}