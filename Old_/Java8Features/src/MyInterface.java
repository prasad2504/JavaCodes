
public interface MyInterface {

	int reverse (int a);
	
	public static void show() {
		System.out.println("abc");
	}
	
	public default void test() {
		System.out.println("ITM>MI");
	}
}
