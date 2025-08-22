package example;

public class DeadLock {
	
	public static void main(String[] args) {
		
		
		String lock1 = "prasad";
		String lock2 = "Riyuuu";
		
		
		Thread t1 = new Thread(()->{
			synchronized(lock1) {
				System.out.println("holding lock1");
				
				System.out.println("waiting for lock2");
				
				synchronized(lock2) {
					System.out.println( "abx"+"holding lock2");
				}
				
			}
		});
		
		Thread t2 = new Thread(()->{
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized(lock2) {
				System.out.println("holding lock2");
				
			
				
				System.out.println("waiting for lock1");
				
				synchronized(lock1) {
					System.out.println("abx"+"holding lock1");
				}
				
			}
		});
		
		
		t1.start();
		t2.start();
		
		
	}

}


