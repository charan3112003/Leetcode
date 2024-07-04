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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> q1=new ArrayList<>();
        List<Integer> q2 =new ArrayList<>();

        leafpreorder(q1,root1);
        leafpreorder(q2,root2);
       
        if(q1.size()!=q2.size()){
            return false;
        }
        // if(q1.size()==q2.size()){
        //     while(!q1.isEmpty()&&!q2.isEmpty()){
        //         int a=q1.remove();
        //         int b=q2.remove();
        //         if(a==b){
        //             continue;
        //         }
        //         else{
        //             return false;
        //         }

        //     }  
        
        return q1.equals(q2);
        // leaffunc(q1,root1);
        // leaffunc(q2,root2);
    }
    public static void leafpreorder(List<Integer> q,TreeNode r){
        if(r==null){
            return;
        }
        if(r.left==null&&r.right==null){
             q.add(r.val);
            return ;
        }
      
        
        leafpreorder(q,r.left);
        leafpreorder(q,r.right);
    }
}