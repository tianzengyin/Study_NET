package CallableTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


class NumThread implements Callable<Integer>{

	@Override
	public Integer/*Object */call() throws Exception {
		int sum =0;
		for(int i=1;i<=100;i++){
			if(i%2==0)
				System.out.println(i);
			sum += i;
		}
		
		return sum;
		
		
	}
	
}
public class ThreadNew {
public static void main(String[] args) {
	NumThread nt = new NumThread();
	FutureTask<Integer> f1 = new FutureTask<Integer>(nt);
	Thread t1 = new Thread(f1);
	t1.start();
	try {
		//get()返回值即为futureTask构造器参数
		//Callable实现类重写的call()的返回值
		
		Integer /*Object*/ sum =f1.get();
		System.out.println("总和为"+sum);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	} catch (ExecutionException e) {
		
		e.printStackTrace();
	}
}
}
