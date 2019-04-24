package cn.mxl.MxlThread;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Run {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WriteData writeData=new WriteData();
		ReadData readData=new ReadData();
		
		PipedInputStream pis=new PipedInputStream();
		PipedOutputStream pos=new PipedOutputStream();
		
		pos.connect(pis);
		
		ThreadWrite threadWrite=new ThreadWrite(writeData, pos);
		ThreadRead threadRead=new ThreadRead(readData, pis);
		
		Thread threadW=new Thread(threadWrite);
		Thread threadR=new Thread(threadRead);
		
		threadW.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadR.start();
		
	}

}
