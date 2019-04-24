package cn.mxl.merge;

import cn.mxl.tool.ListNode;

public class MergeLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
class SolutionMergeLinked {
    public ListNode Merge(ListNode list1,ListNode list2) {
    	if(list1==null) {
    		return list2;
    	}
        if(list2==null) {
    		return list1;
    	}
    	if(list1.val>=list2.val) {
    		list2.next=Merge(list1, list2.next);
    		return list2;
    	}else {
    		list1.next=Merge(list1.next,list2);
    		return list1;
    	}
    }
    public ListNode Merge2(ListNode list1,ListNode list2) {
			if(list1 == null){
	            return list2;
	        }
	        if(list2 == null){
	            return list1;
	        }
	        ListNode mergeHead = null;
	        ListNode current = null;     
	        while(list1!=null && list2!=null){
	            if(list1.val <= list2.val){
	                if(mergeHead == null){
	                   mergeHead = current = list1;
	                }else{
	                   current.next = list1;
	                   current = current.next;
	                }
	                list1 = list1.next;
	            }else{
	                if(mergeHead == null){
	                   mergeHead = current = list2;
	                }else{
	                   current.next = list2;
	                   current = current.next;
	                }
	                list2 = list2.next;
	            }
	        }
	        if(list1 == null){
	            current.next = list2;
	        }else{
	            current.next = list1;
	        }
	        return mergeHead;
    }
    
    
}
