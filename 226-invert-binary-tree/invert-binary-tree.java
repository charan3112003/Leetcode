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
    public TreeNode invertTree(TreeNode root) {
       
        if(root == null){
            return null; 
        }

        
        // q.push(root);
        // while(!q.isEmpty()){
        //     TreeNode p=q.peek();
        //     q.remove();
        //     if(p.left!=null){
        //         TreeNode temp1=p.left;
        //         q.push(p.left);
        //     }
        //     if(p.right!=null){
        //         TreeNode temp2=p.right;
        //         q.push(p.right);
        //     }
        //     TreeNode ans=temp1;
        //     temp1=temp2;
        //     temp2=ans;
        
        TreeNode left=root.left;
        TreeNode right=root.right;
        root.left=invertTree(right);
        root.right=invertTree(left);
        return root;


    }
}
   
