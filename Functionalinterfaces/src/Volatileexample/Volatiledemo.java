package Volatileexample;

public class Volatiledemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		User user = new User();
		
		One firstthread = new One(user);
		Two secondthread = new Two(user);
		
		firstthread.start();
		secondthread.start();
		
		
		firstthread.join();
		secondthread.join();
		
		
	}

}

class User {
	volatile int count = 1;
	
	public void inc() {
		count++;
	}
	
	public int getCount(){
		 return count;
	}
}


class One extends Thread {
	
	User user;
	
	public One(User user) {
		this.user=user;
		
	}

	
	@Override
	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		for(int i=1;i<500;i++) {
			user.inc();
		}
	}
	
	
	
}

class Two extends Thread {
	
	User user;
	
	public Two(User user) {
		this.user=user;
	}

	@Override
	public void run() {
		
		System.out.println("waiting the  condition to be fullfilled...");
		while(true) {
		if(user.getCount()>100)
		{
			System.out.println("Condition executed...breakings");
			break;
		}
		}
		
		
	}
	
	
}