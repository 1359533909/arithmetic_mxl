package cn.mxl.tree;

import java.util.ArrayList;

import cn.mxl.tool.TreeNode;

public class LayerPrintBinary22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class SolutionLayerPrintBinary22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<TreeNode> listTree=new ArrayList<TreeNode>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        TreeNode temp;
        if(root==null) {
        	return list;
        }
        listTree.add(root);
        while(!listTree.isEmpty()) {
        	temp=listTree.remove(0);
        	list.add(temp.val);
        	if(temp.left!=null) {
        		listTree.add(temp.left);
        	}
        	if(temp.right!=null) {
        		listTree.add(temp.right);
        	}
        }
        return list;
    }
}
