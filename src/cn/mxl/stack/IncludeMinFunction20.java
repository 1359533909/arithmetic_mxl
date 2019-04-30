package cn.mxl.stack;

import java.util.Arrays;
import java.util.Stack;

public class IncludeMinFunction20 {
	public static void main(String[] args) {
		SolutionIncludeMinFunction sim=new SolutionIncludeMinFunction();
		sim.push(3);
		int min1 = sim.min();
		System.out.println(min1);
		sim.push(4);
		int min2 = sim.min();
		System.out.println(min2);
		sim.push(2);
		int min3 = sim.min();
		System.out.println(min3);
		sim.push(3);
		int min4 = sim.min();
		System.out.println(min4);
		sim.pop();
		int min5 = sim.min();
		System.out.println(min5);
		sim.pop();
		int min6 = sim.min();
		System.out.println(min6);
		sim.pop();
		int min7 = sim.min();
		System.out.println(min7);
		sim.push(0);
		int min8 = sim.min();
		System.out.println(min8);
		
	}
}
class SolutionIncludeMinFunction {
	private Stack<Integer> minStack= new Stack<Integer>();
	private int min=Integer.MAX_VALUE;
	private int[] elements=new int[10];
    private int size=0;
	
    public void push(int node) {
    	expandCapacity(size+1);
    	elements[size++]=node;
        if(node<min) {
        	min=node;
        	minStack.push(min);
        }else {
        	minStack.push(min);
        }
    }
    public void expandCapacity(int Esize) {
    	int len=elements.length;
    	if(len<Esize) {
    		int newlen=(len*3)/2+1;
    		elements=Arrays.copyOf(elements, newlen);
    	}
    }
    public void pop() {
    	if((size-1)>=0) {
    		elements[size-1]=0;
    		size--;
    		minStack.pop();
    		min=minStack.peek();
    	}
    }
    
    public int top() {
        if((size-1)>=0) {
        	return elements[size-1];
        }
        return 0;
    }
    
    public int min() {
        return min;
    }
}