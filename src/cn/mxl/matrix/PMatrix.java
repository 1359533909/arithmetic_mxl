package cn.mxl.matrix;

import java.util.ArrayList;
import java.util.List;

public class PMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix =new int[4][5];
		int number=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				matrix[i][j]=++number;
			}
		}
//		for (int[] is : matrix) {
//			for(int i=0;i<is.length;i++) {
//				System.out.println(is[i]);
//			}
//		}
		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		 int layers = (Math.min(5,5)-1)/2+1;//这个是层数
		System.out.println(layers);
	}

}
class SolutionPMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
    	ArrayList<Integer> list=new ArrayList<>();
    	if(matrix==null) {
    		return list;
    	}
    	int row=matrix.length;
    	int rank=matrix[0].length;
    	int circle=0;
    	if((Math.min(row,rank)%2)==0){
    		circle=Math.min(row,rank)/2;
    	}else {
    		circle=Math.min(row,rank)/2+1;
    	}
    	for(int i=0;i<circle;i++) {
    		for(int k=i;k<rank-i;k++) {
    			list.add(matrix[i][k]);
    		}
    		for(int j=i+1;j<row-i;j++) {
    			list.add(matrix[j][rank-i-1]);
    		}
    		for(int k=rank-i-2;(k>=i)&&((row-1-i)!=i);k--) {
    			list.add(matrix[row-1-i][k]);
    		}
    		for(int j=row-i-2;(j>i)&&((rank-i-1)!=i);j--) {
    			list.add(matrix[j][i]);
    		}
    	}
		return list;
    }
}