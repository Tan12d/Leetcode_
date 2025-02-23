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
class Solution 
{
    int pre_index=0;
	int post_index=0;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) 
    {
        TreeNode curr = new TreeNode(preorder[pre_index]);
		pre_index++;
		
		if(curr.val != postorder[post_index])
		{
			curr.left = constructFromPrePost(preorder, postorder);
		}
		
		if(curr.val != postorder[post_index])
		{
			curr.right = constructFromPrePost(preorder, postorder);
		}
		
        post_index++;
        
        return curr;       
    }
}