package cn.mxl;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
		int n = SolutionFibonacci.FibonacciN(i);
		System.out.print(n+" ");
		}
	}

}
class SolutionFibonacci {
    public static int Fibonacci(int n) {
    	if(n==1) {
    		return 1;
    	}
    	if(n==0) {
    		return 0;
    	}
		return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static int FibonacciFor(int n) {
    	if(n==1) {
    		return 1;
    	}
    	if(n==0) {
    		return 0;
    	}
    	int[] arr=new int[n+1];
    	arr[0]=0;
    	arr[1]=1;
    	for(int i=2;i<n+1;i++) {
    		arr[i]=arr[i-1]+arr[i-2];
    	}
		return arr[n];
    }
    public static int FibonacciN(int n) {
    	double number=0;
    	double x1=Math.pow((1+Math.sqrt(5))/2, n);
    	double x2=Math.pow((1-Math.sqrt(5))/2, n);
    	number=(x1-x2)/Math.sqrt(5);
		return (int) number;
    	
    }
}
