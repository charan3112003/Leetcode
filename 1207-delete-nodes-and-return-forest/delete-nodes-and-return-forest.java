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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> res =new LinkedList<>();
        Deque<TreeNode> q= new ArrayDeque<>();
        Set<Integer> set =new HashSet<>();
        for(int i:to_delete){
            set.add(i);
        }
        res.add(root);
        q.offer(root);
        while(!q.isEmpty()){
        TreeNode temp=q.poll();
        if(set.contains(temp.val)){
            res.remove(temp);
            if(temp.left!=null) res.add(temp.left);
            if(temp.right!=null) res.add(temp.right);
        }
        if(temp.left!=null){
            q.offer(temp.left);
            if(set.contains(temp.left.val)){
                temp.left=null;
            }
        }
        if(temp.right!=null){
            q.offer(temp.right);
                if(set.contains(temp.right.val)){
                    temp.right=null;
                }
            }
        }
        
        return res;
    }
}