
public class TestMythread2 {

	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2(); 
		MyThread2 t3 = new MyThread2();
		
		t1.setName("one");
		t2.setName("two");
		t3.setName("three");
		
		
		//demon thread is thread which is executed in background
		//without knowing its existence
		//the thread should be set as daemon before calling
		//start method
		
		
		t1.setDaemon(true);
		
		t1.setPriority(1);
		t2.setPriority(7);
		t3.setPriority(10);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("1st priority" +t1.getPriority());
		System.out.println("2nd priority" +t2.getPriority());
		System.out.println("3rd priority" +t3.getPriority());

		System.out.println("1st id" +t1.getId());
		System.out.println("2nd id" +t2.getId());
		System.out.println("3rd id" +t3.getId());
		
	}
}
