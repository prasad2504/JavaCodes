//package mulRevision;
//
//public class Mul5 {
//	
//	//instance level lock
//	public static void main(String[] args) throws InterruptedException {
//		
//		Run run = new Run();
//		Run run2 = new Run();
//		
//		Player1 one = new Player1(run);
//		
//		Player1 onee = new Player1(run2);
//		Player2 two = new Player2(run2);
//		
//		
//		
//		one.start();
//		two.start();
//		onee.start();
//		onee.join();
//		one.join();
//		two.join();
//		
//		
//		
//		run.getrun();
//		run2.getrun();
//		
//	}
//
//}
//
//class Run{
//	
//	int runs=1;
//	
//	public synchronized void incrun() {
//		runs++;
//	}
//	
//	public void getrun() {
//		System.out.println(this.runs);
//	}
//}
//
//
//class Player1 extends Thread {
//	
//	Run runs;
//	
//	public Player1(Run runs) {
//		this.runs=runs;
//	}
//	
//	
//	
//	public void run() {
//		
//		for(int i=1;i<=5000;i++) {
//			
//			runs.incrun();
//			
//			
//		}
//	}
//}
//
//class Player2 extends Thread{
//	Run runs;
//	
//	public  Player2(Run runs) {
//		this.runs=runs;
//	}
//	
//	public void run () {
//		
//		for(int i=1; i<=10000;i++) {
//			runs.incrun();
//		}
//	}
//}