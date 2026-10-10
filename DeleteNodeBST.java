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
    public TreeNode deleteNode(TreeNode root, int key) {
       
        return delete(root,key);
    }
    public TreeNode delete(TreeNode node,int key){
         if(node==null){
            return null;
        }
        if(node.val<key){
            node.right=delete(node.right,key);
        }else if(node.val>key){
            node.left=delete(node.left,key);
        }else{
            if(node.left==null){
                return node.right;
            }else if(node.right==null){
                return node.left;
            }else{
                TreeNode n=node.right;
                while(n.left!=null){
                    n=n.left;
                }
                node.val=n.val;
                node.right=delete(node.right,n.val);
                return node;
            }
        }
        return node;
    }
}
