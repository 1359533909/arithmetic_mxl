package cn.mxl.reentrant;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyService myService=new MyService();
		
		ThreadA threadA=new ThreadA(myService);
		
		Thread thread=new Thread(threadA);
		
		thread.start();
		Thread.sleep(1000);
		myService.sinal();
	}

}
