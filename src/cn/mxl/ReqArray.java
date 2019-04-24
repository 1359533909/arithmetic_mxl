package cn.mxl;

import java.util.*;
import java.util.LinkedList;

public class ReqArray {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7};
		//1,3,5,7,2,4,6
		// TODO Auto-generated method stub
		int[] array2 = SolutionReqArray.reOrderArray(array);
		for (int i : array2) {
			System.out.print(i+",");
		}
	}

}
class SolutionReqArray {
    public static int[] reOrderArray(int [] array) {
        List<Integer> list=new LinkedList();
        for(int i=0;i<array.length;i++) {
        	list.add(array[i]);
        }
        int point=0;
        for(int i=0;i<list.size();i++) {
        	if((list.get(i)%2)!=0) {
        		list.add(point, list.get(i));
        		list.remove(i+1);
        		point++;
        	}
        }
        for(int i=0;i<array.length;i++) {
        	array[i]=list.get(i);
        }
        return array;
    }
}