package ThreadpoolDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPool {
	
	public static void main(String[] args) {
		//1.提供指定线程数量的线程池
		ExecutorService exectorService = Executors.newFixedThreadPool(10);
		//设置线程池的属性
		ThreadPoolExecutor service1 = (ThreadPoolExecutor) exectorService;
		service1.setCorePoolSize(15);
		//service1.setKeepAliveTime(50022214L, 100);
		System.out.println(exectorService.getClass());
		//2.执行指定的线程的操作，需要提供实现Runnable接口或Callable接口实现类的对象
		exectorService.execute(new NumberThread());//适合使用与Runable接口创建的对象
		
		exectorService.execute(new NumberThread1());
		exectorService.shutdown();//关闭连接池
		//exectorService.submit(null);//适合使用于Callable接口创建的对象
	}

}
class NumberThread implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<100;i++){
			if(i%2==0){
				System.out.println(Thread.currentThread().getName()+"--->"+i);
			}
		}
	}
	
}
class NumberThread1 implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<100;i++){
			if(i%2!=0){
				System.out.println(Thread.currentThread().getName()+"--->"+i);
			}
		}
	}
	
}