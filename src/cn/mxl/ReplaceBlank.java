package cn.mxl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceBlank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer();
		String string=" ";
		str.append(string);
		System.out.println(str);
	}

}
class SolutionReplaceBlank{
	public static String replaceSpace(StringBuffer str) {
		final  String REGEX=" ";
		final  String REPLACE="%20";
		Pattern p=Pattern.compile(REGEX);
		Matcher m = p.matcher(str);
		String temp;
		temp=m.replaceAll(REPLACE);
		return  temp;
	}
	public static String MyReplaceSpace(StringBuffer str) {
		int length = str.length();
		final String REPLACE="%20";
		for(int i=0;i<length;i++){
			if(str.charAt(i)==' ') {
				str.deleteCharAt(i);
				str.insert(i, REPLACE);
			}
		}
		String string=new String(str);
		return string;
	}
}
