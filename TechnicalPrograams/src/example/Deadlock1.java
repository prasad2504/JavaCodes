package example;

public class Deadlock1 {
	public static void main(String[] args) {
		
		
		String lock1 ="prasad";
		
		String lock2="abc";
		
		
		Thread t1 = new Thread(()->{
			
			synchronized(lock1) {
			System.out.println("lock1");
			}
			
		});
	}

}
