package cn.mxl.tree;

import cn.mxl.tool.TreeNode;

public class HasSubtrees17 {

}
class SolutionHasSubtress17 {
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	boolean flag=false;
    	if(root1!=null&&root2!=null) {
    		if(root1.val==root2.val) {
    			flag=ifTree1HasTree2(root1.left,root2.left)&&ifTree1HasTree2(root1.right,root2.right);
    		}
    		if(!flag) {
    			flag=HasSubtree(root1.left,root2);
    		}
    		if(!flag) {
    			flag=HasSubtree(root1.right,root2);
    		}
    	}
		return flag;
    }
    
    public static boolean ifTree1HasTree2(TreeNode root1,TreeNode root2) {
    	if(root2==null) {
    		return true;
    	}
    	if(root1==null) {
    		return false;
    	}
    	if(root1.val==root2.val) {
    		return ifTree1HasTree2(root1.left,root2.left)&&ifTree1HasTree2(root1.right,root2.right);
    	}
		return false;
    }
}