
public class AmezonFactory {
	
	static MensWear a;
	public static MensWear getData(String type) {
		if(type.equals("Tshirt")) {
			a = new Tshirt();
		}
		else if(type.equals("Trouser")) {
			a = new Trouser();
		}
		else if(type.equals("Jeans")) {
			a = new Jeans();
		}
		return a;
	}
	

}
