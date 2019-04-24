package cn.mxl.MxlThread;

import java.io.PipedOutputStream;

public class ThreadWrite implements Runnable {
	private WriteData writeData;
	private PipedOutputStream pos;
	public ThreadWrite(WriteData writeData,PipedOutputStream pos) {
		// TODO Auto-generated constructor stub
		this.writeData=writeData;
		this.pos=pos;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		writeData.writeMethod(pos);
	}

}
