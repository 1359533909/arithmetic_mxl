package cn.mxl;

import cn.mxl.tool.ListNode;

public class ReversalLinked {
	public static void main(String[] args) {
		User user=new User();
		user.setAge(18);
		user.setName("mxl");
		System.out.println("user:"+user.toString());
		User user2=user;
		user2.setName("ldq");
		System.out.println("user:"+user.toString());
		System.out.println("user2:"+user2.toString());
		
	}
}
 class SolutionReversalLinked {
    public static ListNode ReverseList(ListNode head) {
    	if(head==null) {
    		return head;
    	}
    	ListNode LinkedHead=null;
    	ListNode pre=null;
    	ListNode currentLinked=head;
    	ListNode temp=head;
    	while(currentLinked!=null) {
    		temp=currentLinked.next;
    		currentLinked.next=pre;
    		if(temp==null) {
    			LinkedHead=currentLinked;
    		}
    		pre=currentLinked;
    		currentLinked=temp;
    	}
		return LinkedHead;
    }
}
