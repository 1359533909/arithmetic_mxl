package cn.mxl;

public class RegtangleOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rectCover = SolutionRegtangleOver.RectCover(4);
		System.out.println(rectCover);
	}

}
class SolutionRegtangleOver {
    public static int RectCover(int target) {
    	if(target==0) {
    		return 0;
    	}
    	double x1=Math.pow((1+Math.sqrt(5))/2, target+1);
    	double x2=Math.pow((1-Math.sqrt(5))/2, target+1);
    	double number=(x1-x2)/Math.sqrt(5);
		return (int)number;
    }
}