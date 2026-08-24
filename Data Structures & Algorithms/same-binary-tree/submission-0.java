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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        List<Integer> parr = new ArrayList<>();
        List<Integer> qarr = new ArrayList<>();

        traversal(p, parr);
        traversal(q, qarr);

        return parr.equals(qarr);
        
    }

    public void traversal(TreeNode root, List<Integer> arr) {

        if (root == null) {
            arr.add(null);
            return;
        }

        arr.add(root.val);
        traversal(root.left, arr);
        traversal(root.right, arr);

        



    }
}