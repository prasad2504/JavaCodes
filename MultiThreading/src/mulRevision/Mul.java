package mulRevision;

public class Mul {
	
	public static void main(String[] args) {
		
		
		Thread first = new First();
		Thread second= new Second();
		Thread third = new Third();
		
		first.start();
		second.start();
		third.start();
		
		
		
			
	}

}

class First extends Thread {
	
	public void run() {
		
		for(int i=0;i<=10;i++) {
			System.out.println("First thread : "+i);
			System.out.println();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}


class Second extends Thread{
	
	public void run() {
		
		for(int i=0;i<=10;i++) {
			System.out.println("Second thread : "+i);
			System.out.println();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}

class Third extends Thread{
	
	public void run() {
		
		for(int i=0;i<=10;i++) {
			System.out.println("Third thread : "+i);
			System.out.println();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}