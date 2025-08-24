
public interface SubMyInterface extends MyInterface {

	public static void show() {
		System.out.println("abc");
	}
	
	
	public default void test() {
		System.out.println("ITM>SMI");
	}
}
