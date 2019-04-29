package cn.mxl;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newScheduledThreadPool(5);
		Thread task1=new Thread(()-> {
			System.out.println("i am task1");
		});
		Thread task2=new Thread(()-> {
			System.out.println("i am task2");
		});
//		pool.execute(task1);
//		pool.execute(task2);
		pool.submit(task1);
		pool.submit(task2);
	}
}
