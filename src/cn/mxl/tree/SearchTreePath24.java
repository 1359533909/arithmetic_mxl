package cn.mxl.tree;

import java.util.ArrayList;

import cn.mxl.tool.TreeNode;

public class SearchTreePath24 {
	public static void main(String[] args) {
		
	}
}
class SolutionSearchTreePath24 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    	ArrayList<ArrayList<Integer>> paths=new ArrayList<ArrayList<Integer>>();
    	if(root==null) {
    		return null;
    	}
    	find(paths,new ArrayList<Integer>(),root,target);
    	return paths;
    }
    public void find(ArrayList<ArrayList<Integer>> paths,ArrayList<Integer> path,TreeNode root,int target) {
    	path.add(root.val);
    	if(root.left==null&&root.right==null) {
    		if(target==root.val) {
    			paths.add(path);
    		}
    		return;
    	}
    	ArrayList<Integer> path2=new ArrayList<Integer>();
    	path2.addAll(path);
    	if(root.left!=null) {
    		find(paths,path,root.left,target-root.val);
    	}
    	if(root.right!=null) {
    		find(paths,path2,root.right,target-root.val);
    	}
    }
}