package Volatileexample;



public class Volatiledemo3 {
	 
	public static void main(String[] args) throws InterruptedException {
		
		Player p1 = new Player();
		
		FirstThread one = new FirstThread(p1);
		SecondThread two = new SecondThread(p1);
		
		
		one.start();
		two.start();
		
		one.join();
		two.join();
		
		
			    	
			    		
	}
}
 

class Player {
	
	volatile int runs=1;
	
	public void inc() {
		runs++;
	}
	
	public int getruns() {
		return runs;
	}
}

class FirstThread extends Thread{
	Player player;
	
	public FirstThread(Player player) {
		this.player=player;
	}
	
	public void run(){
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=1;i<=500;i++) {
			player.inc();
		}
		
		
		System.out.println(player.getruns());
	}
	
}

class SecondThread extends Thread{
	Player player;
	
	public SecondThread(Player player) {
		this.player=player;
	}
	
	public void run() {
		
		
		System.out.println("waiting for condition fullfilled...............................");
		
		while(true) {
			
			
			if(player.getruns()>100) {
				System.out.println("condition fullfilled");
				break;
			}
			
		}
		
	}
	
}