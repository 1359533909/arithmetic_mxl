package cn.mxl;

import cn.mxl.tool.Mylock;

public class TestYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mylock mylock=new Mylock();
		Thread thread=new Thread(mylock);
		Thread thread2=new Thread(mylock);
		thread.start();
		thread2.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
