package mulRevision;

public class Mul4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		Counter counter2 = new Counter();
		
		
		Thread3 one = new Thread3(counter);
		Thread3 two = new Thread3(counter);
		Thread3 three = new Thread3(counter);
		Thread3 four= new Thread3(counter2);
		
		
		
		one.start();
		one.join();
		two.start();
		two.join();
		three.start();
		three.join();
		four.start();
		four.join();
		
	System.out.println(counter.count);
	System.out.println(counter2.count);
	}

}


class Counter {
	int count =10;
	
	public  void incCount() {
		
		count++;
		
	}
	
	public void getCount() {
		System.out.println(count);
	}
}

class Thread3 extends Thread {
	
	Counter count;
	
	public Thread3 (Counter count) {
		this.count=count;
	}
	

	@Override
	public void run() {
		
		for(int i=1;i<=500;i++) {
			count.incCount();
		}
		
	}
	
}





//que1 - two ways to create thread extends Thread and implements Runnable then when we are extending thread there is .start method bydefault but when implements Runnable then there is no .start method why ??
//que2 - i didnt need to use synchronized keyword.