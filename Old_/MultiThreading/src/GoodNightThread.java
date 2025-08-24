
public class GoodNightThread extends Thread {
 
	public void run() {
		for(int i = 1 ; i <=10 ; i++) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
			System.out.println("Good Night");
		}
		
	}
	
}
