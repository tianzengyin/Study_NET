package Test02;
/**
 * 线程名称:
 * 		主线程:main
 * 		新线程:Thread-0 Thread-1 Thread-2
 * 
 * **/
public class MyThread extends Thread{
	public MyThread(){}
	public MyThread(String name){
		super(name);
	}
	
	 
	//重写Thread类中的run方法,设置线程任务
	@Override
	public void run(){
		//获取线程名称
		/*String name = this.getName();
		System.out.println(name);*/
		
		/*Thread t = Thread.currentThread();
		System.out.println(t);*/
		//链式编程
		System.out.println(Thread.currentThread().getName());
		
		
	}
	
	
}
