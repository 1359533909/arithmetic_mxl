package cn.mxl.MxlThread;

import java.io.PipedInputStream;

public class ThreadRead implements Runnable{
	private ReadData readData;
	private PipedInputStream pis;
	public  ThreadRead(ReadData readData,PipedInputStream pis) {
		// TODO Auto-generated constructor stub
		this.readData=readData;
		this.pis=pis;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		readData.readData(pis);
	}

}
