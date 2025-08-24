
public class MyThreadFizzBizz implements Runnable {

	
	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
 		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0)
				System.out.print(" FizzBizz ");
			else if (i%3==0) 
				System.out.print(" fizz ");
				else if (i%5==0)
					System.out.print( " Bizz ");
				else 
					System.out.print(" " + i + " ");
			
		}
		
	}
	
	

}
