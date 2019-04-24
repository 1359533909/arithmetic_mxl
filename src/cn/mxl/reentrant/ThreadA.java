package cn.mxl.reentrant;

public class ThreadA implements Runnable{
	private MyService myService;
	public ThreadA(MyService myService) {
		this.myService=myService;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		myService.await();
	}
	
}
