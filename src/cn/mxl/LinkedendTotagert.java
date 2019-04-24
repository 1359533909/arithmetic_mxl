package cn.mxl;


import cn.mxl.tool.ListNode;
import cn.mxl.tool.ListTool;

public class LinkedendTotagert {
	public static void main(String[] args) {
		ListTool list=new ListTool<Integer>();

	}
}
//1,{1,2,3,4,5}
class SolutionLinkedendTotagert {
    public static ListNode FindKthToTail(ListNode head,int k) {
    	if(head==null) {
    		return head;
    	}
    	if(head.next==null) {
    		return head;
    	}
    	ListNode scale=head;
    	for(int i=0;i<k-1;i++) {
    		scale=scale.next;
    	}
    	ListNode anw=head;
    	while(scale!=null) {
    		scale=scale.next;
    		anw=anw.next;
    	}
		return anw;
    }
}
