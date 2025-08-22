




package mulRevision;

import java.util.ArrayList;
import java.util.List;

public class Mutual {
	public static void main(String[] args) {
		
		Number number = new Number();
		
		addservice addthread = new addservice(number);
		removeservice removethread = new removeservice(number);
		
		addthread.start();
		removethread.start();
		
		
		
		
	}

}

class Number {
	
	
	int no=1;
	
	List<Integer> list = new ArrayList();
	
	
	public synchronized void addno () throws InterruptedException {
		
		if(list.size()==5) {
			System.out.println("size fulled please remove");
			wait();
		}
		
		list.add(no);
		System.out.println("element added");
		no++;
		notify();
		
	}
	
	public synchronized void removeno() throws InterruptedException {
		
		if(list.size()==0) {
			System.out.println("list empty please add");
			wait();
		}
		
		list.remove(0);
		System.out.println("element removed");
		notify();
		
	}
}





class addservice extends Thread {
	
	Number number;
	
	public addservice(Number number) {
		
		this.number=number;
		
	}
	
	public void run() {
		
		while(true) {
		try {
			number.addno();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}






class removeservice extends Thread {
	
	Number number;
	
	public removeservice (Number number) {
		
		this.number=number;
	}
	
	public void run () {
		
		while(true) {
		
		try {
			number.removeno();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
