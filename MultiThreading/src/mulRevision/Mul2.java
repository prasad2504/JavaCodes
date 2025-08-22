package mulRevision;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mul2 {
	public static void main(String[] args) {
		
		
		Thread One = new Movie("KKR");
		Thread Two = new Movie("Bahubali");
		Thread Three = new Movie("Kalki");
		
		
		
		ExecutorService pool = Executors.newFixedThreadPool(1);
		
		pool.execute(One);
		pool.execute(Two);
		pool.execute(Three);
		
		pool.shutdown();
		
		
	}

}


class Movie extends Thread{
	
	String name;
	
	public Movie(String name) {
		this.name=name;
	}
	


	public void run () {
		
		for(int i=1;i<9;i++) {
			System.out.println(" " +i);
			//System.out.println("-----------");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name+" :fnished!");

		}
		
		
	
	
}




