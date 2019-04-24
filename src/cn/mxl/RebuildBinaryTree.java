package cn.mxl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cn.mxl.tool.TreeNode;

public class RebuildBinaryTree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] pre= {1 , 2,  4 , 5 , 7 , 8,  3,  6 };
		int [] in= {4 , 2 , 7 , 5 , 8 , 1 , 3 , 6};
	}

}
class SolutionRebuildBinaryTree{
	public  static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if(pre.length==0||in.length==0) {
			return null;
		}
		TreeNode node=new TreeNode(pre[0]);
		if(pre.length==1||in.length==1) {
			return node;
		}
		for(int i=0;i<pre.length;i++) {
			if(pre[0]==in[i]) {
				node.left=reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1),Arrays.copyOfRange(in, 0, i));
				node.right=reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length),Arrays.copyOfRange(in, i+1, in.length));
			}
		}
		return node;
	}
	
	public static void preTravesal(TreeNode treeNode) {
		if(treeNode!=null) {
			System.out.println(treeNode.val);
			preTravesal(treeNode.left);
			preTravesal(treeNode.right);
		}
		
	}
}
