package 重建二叉树;


public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        int pre_length = pre.length;
        int in_length = in.length;
        if(pre_length ==0 && in.length == 0)
        	return null;
        return btTreeConstruct(pre, in, 0, pre_length-1, 0, in_length-1);
    }
    
    public TreeNode btTreeConstruct(int [] pre, int [] in, int pstart, int pend, int istart, int iend){
    	
    	TreeNode treeNode = new TreeNode(pre[pstart]);
    	treeNode.left = null;
    	treeNode.right = null;
    	if(pstart == pend && istart == iend)
    		return treeNode;
    	// 寻找中序遍历 中的根节点位置
    	int root_index;
    	for (root_index = istart;root_index < iend; root_index++){
    		if(in[root_index] == pre[pstart])
    			break;
    	}
    	int leftLength = root_index - istart;
    	int rightLength = iend - root_index;
    	if (leftLength > 0)
    		treeNode.left = btTreeConstruct(pre, in, pstart+1, pstart+leftLength, istart, root_index-1);
    	if (rightLength > 0)
    		treeNode.right = btTreeConstruct(pre, in, pstart + leftLength + 1 , pend, root_index + 1, iend);
    		
    	return treeNode;
    }
    
}


class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
 }
 