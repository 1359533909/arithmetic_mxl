package cn.mxl;

public class BinaryOneOfCount {
	public static void main(String[] args) {
		int number = SolutionBinaryOneOfCount.NumberOf1(3);
		System.out.println(number);
	}
}
class SolutionBinaryOneOfCount {
    public static int NumberOf1(int n) {
    	if(n==0) {
    		return 0;
    	}
    	int count=0;
    	while(n!=0) {
    		count++;
    		n=n&(n-1);
    	}
		return count;

    }
}