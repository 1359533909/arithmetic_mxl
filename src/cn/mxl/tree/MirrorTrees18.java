package cn.mxl.tree;

import cn.mxl.tool.TreeNode;

public class MirrorTrees18 {
	public static void main(String[] args) {
		
	}
}
class SolutionMirrorTrees18 {
    public void Mirror(TreeNode root) {
        TreeNode temp=null;
        if(root!=null) {
        	temp=root.left;
        	root.left=root.right;
        	root.right=temp;
        	if(root.left!=null) {
        		Mirror(root.left);
        	}
        	if(root.right!=null) {
        		Mirror(root.right);
        	}
        }
    }
}