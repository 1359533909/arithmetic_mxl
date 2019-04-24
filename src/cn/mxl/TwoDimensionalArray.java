package cn.mxl;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j]=i+j;
			}
		}
		boolean find1 = SolutionTwoDimensionalArray.find(4, arr);
		boolean find2 = SolutionOptimize.find(4, arr);
		System.out.println(find1);
		System.out.println(find2);
	}
}

class SolutionTwoDimensionalArray{
	public static boolean find(int target,int[][] array) {
		boolean flag=false;
		int rows=array.length;
		int columns=array[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(array[i][j]==target) {
					flag=true;
					break;
				}
			}
		}
		return flag;
	}
}

class SolutionOptimize{
	public static boolean find(int target,int[][] array) {
		boolean flag=false;
		int rows=array.length-1;
		int columns=array[0].length-1;
		final int ROWS=rows;
		final int COLUMNS=columns;
		
		int row=0;
		int column=0;
		while(row<=ROWS&&column<=COLUMNS) {
			if(array[row][COLUMNS]==target) {
				flag=true;
				break;
			}else if(array[row][COLUMNS]>target){
				for(int i=COLUMNS;i>=0;i--) {
					if(array[row][i]==target) {
						flag=true;
						break;
					}
				}
				row++;
			}else {
				row++;
			}
			
		}
		return flag;
	}
}