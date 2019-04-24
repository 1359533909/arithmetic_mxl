package cn.mxl;

public class ValueOfIntegerPower {
	public static void main(String[] args) {
		double q = SolutionValueOfIntegerPower.PowerQ(2, 10);
		System.out.println(q);
	}

}
class SolutionValueOfIntegerPower {
    public static double Power(double base, int exponent) {
    	double pow = Math.pow(base, exponent);
		return pow;
  }
    public static double PowerQ(double base, int exponent) {
    	if(exponent==0) {
    		return 1;
    	}
    	int e=exponent>0?exponent:-exponent;
    	 double ans = 1;
    	while(e!=0) {
    		 ans = (e & 1) != 0 ? ans * base : ans;
    		 base*=base;
    		 e=e>>1;
    	}
    	return exponent > 0 ? ans : 1/ans;
    }
}