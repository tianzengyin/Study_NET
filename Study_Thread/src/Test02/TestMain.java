package Test02;

public class TestMain {

	public static void main(String[] args) {
		/*//创建Thread类的子类对象
		MyThread  mt1= new MyThread("小强");
		//调用start方法,开启新线程执行run方法
		mt1.start();
		
		MyThread  mt2= new MyThread("旺财");
		mt2.start();
		
		MyThread  mt3= new MyThread("哈哈");
		mt3.start();*/
		for(int i = 1 ;i<60;i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			catch(IllegalArgumentException e){
				e.printStackTrace();
			}
			}
		}
		
		
		//匿名内部类实现线程创建
		//new MyThread().start();
		/*new Thread(){

			@Override
			public void run() {
				
				for(int i = 0;i<20;i++){
					System.out.println(Thread.currentThread().getName());
				}
			}
			
		}.start();
		
		
		Runnable r = new Runnable(){

			@Override
			public void run() {
				for(int i =0;i<20;i++){
					System.out.println(Thread.currentThread().getName());
				}
			}
			
		};
		
		new Thread(r).start();
		new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i =0;i<20;i++){
					System.out.println(Thread.currentThread().getName());
				}
			}
			
		}).start();
	}*/

}
