package cn.mxl.reentrant;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock=new ReentrantLock();
	private Condition condition=lock.newCondition();
	public void await() {
		try {
			lock.lock();
			System.out.println("await时间:"+System.currentTimeMillis());
			condition.await();
			lock.unlock();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void sinal() {
		lock.lock();
		System.out.println(System.currentTimeMillis());
		condition.signal();
		lock.unlock();
	}
}
