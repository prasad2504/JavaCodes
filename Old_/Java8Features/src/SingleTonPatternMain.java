
public class SingleTonPatternMain {

	public static void main(String[] args) {
		SingleTonPattern a1 = SingleTonPattern.getObject();
		SingleTonPattern a2 = SingleTonPattern.getObject();
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}
}
