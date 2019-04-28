package cn.mxl.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

public class Test {
	public static void main(String[] args) {
		File file=new File("pom.xml");
		try {
			FileInputStream fis=new FileInputStream(file);
			InputStreamReader isr=new InputStreamReader(fis);
			char[] cbuf=new char[1024];
			String str="";
			if(isr.read(cbuf)!=-1) {
				str=str+new String(cbuf);
			}
			System.out.println(str);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
