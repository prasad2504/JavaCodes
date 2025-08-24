package mulRevision;

public class Mul3 {
	public static void main(String[] args) throws InterruptedException {
		
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		
		Thread one = new Thread(thread1);
		Thread two = new Thread(thread2);
		
		one.start();
		one.join();
		two.start();
		two.join();
		
		
		System.out.println("Main  thread execution");
		
	}
}


class Thread1 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Thread1 running");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

class Thread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread2 running");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

//que every thread has 1500 ms time then why they are not running at same time 
