
public class TestMorNight {
	
	public static void main(String[] args) {
		
		GoodMorningThread t1 = new GoodMorningThread();
		GoodNightThread t2 = new GoodNightThread();
		
		t1.start();
		t2.start();
		
	}

}

//thread class start() registers the thread with 
//thread shceduler
//thread schedular will create new stack frame for the
//thread and then it calls the run method
//thats is why , we should not call run() directly


//t2.start()
//thread should be started only once
//calling start() twice will  throw a error illigegal exceptionṇ
