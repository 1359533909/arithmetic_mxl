package cn.mxl.stack;

import java.util.Stack;

public class StackPopPushSeries21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class SolutionStackPopPushSeries21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	Stack<Integer> stack=new Stack<Integer>();
    	int index=0;
      if(pushA==null||popA==null) {
    	  return false;
      }
      for(int i=0;i<pushA.length;i++) {
    	  stack.push(pushA[i]);
    	  while(!stack.isEmpty()&&stack.peek()==popA[index]) {
    		  stack.pop();
    		  index++;
    	  }
      }
      return stack.isEmpty();
    }
}