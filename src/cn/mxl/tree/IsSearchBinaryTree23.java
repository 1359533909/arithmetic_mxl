package cn.mxl.tree;

public class IsSearchBinaryTree23 {
	public static void main(String[] args) {
		System.out.println(SolutionIsSearchBinaryTree23.VerifySquenceOfBST(new int[] {7,4,6,5}));
	}
}
class SolutionIsSearchBinaryTree23 {
    public static boolean VerifySquenceOfBST(int [] sequence) {
    	if(sequence.length==0) {
    		return false;
    	}
    	if(sequence.length==1) {
    		return true;
    	}
    	int root=sequence.length-1;
		return isSquenceOfBST(sequence,0,root);
    }
    public static boolean  isSquenceOfBST(int a[],int start,int root) {
    	 if(root==0)
             return true;
    	int r=root-1;
    	while(r>start&&a[r]>a[root]) {
    		r--;
    	}
    	for(int i=start;i<r;i++) {
    		if(a[i]>a[root]) {
    			return false;
    		}
    	}
    	return 	isSquenceOfBST(a,start,r)&&isSquenceOfBST(a,start,root-1);
    }

   public static boolean ju(int[] a,int star,int root){
    	        if(star>=root)
    	            return true;
    	        int i = root;
    	        //从后面开始找
    	        while(i>star&&a[i-1]>a[root])
    	            i--;//找到比根小的坐标
    	        //从前面开始找 star到i-1应该比根小
    	        for(int j = star;j<i-1;j++)
    	            if(a[j]>a[root])
    	                return false;;
    	        return ju(a,star,i-1)&&ju(a, i, root-1);
    	    }
}
