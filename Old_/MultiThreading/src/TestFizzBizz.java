
public class TestFizzBizz {

	public static void main(String[] args) {
		MyThreadFizzBizz r = new MyThreadFizzBizz();
		Thread t1 = new Thread(r);
		t1.start( );
	}
}
