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
   
    public int deepestLeavesSum(TreeNode root) {
        //int sum=0;
        int dep=maxdepth(root);
        int ans=leavesum(dep,root,0);
        return ans;
    }
    public static int maxdepth(TreeNode root){
        if(root==null){
            return -1;
        }
        return Math.max(maxdepth(root.left),maxdepth(root.right))+1;
    }
    int sum=0;
    public int  leavesum(int depth,TreeNode root,int curr){
        if(root!=null){
            if(depth==curr){
                sum+=root.val;
            }
            leavesum(depth,root.left,curr+1);
            leavesum(depth,root.right,curr+1);
        }
        return sum;

    }
}