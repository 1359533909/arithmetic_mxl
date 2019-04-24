package cn.mxl;

public class FrogJumpFloor {
	public static void main(String[] args) {
		int number = Solution.JumpFloorFor(4);
		System.out.println(number);
	}
}
class Solution {
    public static int JumpFloor(int target) {
    	if(target<=2) {
    		return target;
    	}
		return JumpFloor(target-1)+JumpFloor(target-2);
    }
    public static int JumpFloorFor(int target) {
    	if(target<=2) {
    		return target;
    	}
    	int[] arr=new int[target];
    	arr[0]=1;
    	arr[1]=2;
    	for(int i=2;i<target;i++) {
    		arr[i]=arr[i-1]*2;
    	}
		return arr[target-1];
    }
}
