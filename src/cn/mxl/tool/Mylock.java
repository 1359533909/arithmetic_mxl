package cn.mxl.tool;

import java.util.concurrent.locks.ReentrantLock;

public class Mylock implements Runnable{
	private ReentrantLock lock=new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		lock.lock();
			for(int i=0;i<500;i++) {
				System.out.println(Thread.currentThread().getName()+":"+i);
		}
			lock.unlock();
	}

}
