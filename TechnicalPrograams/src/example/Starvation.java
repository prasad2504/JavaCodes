package example;

public class Starvation {
	
	public static void main(String[] args) {
		
		String lock = "PRASAD";
		
		Thread one = new Thread(()->{
			synchronized(lock) {
			System.out.println("first thread ");
			try {
				lock.wait();
				System.out.println("got notified");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		});
		
		
		Thread two = new Thread(()->{
			synchronized(lock) {
			System.out.println("second thread");
			lock.notify();
			
			}
		});
		
		one.start();
		two.start();
	}	

}
