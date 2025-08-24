
public class MyThread2 extends Thread {
     public void run() {
    	 for ( int i =1 ; i<=10 ; i++) {
    		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
    		 System.out.println(Thread.currentThread().getName()+ " " +i);
    	 }
     }
}
