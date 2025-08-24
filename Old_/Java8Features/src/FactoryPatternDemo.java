
public class FactoryPatternDemo {
	public static void main(String[] args) {
		Tshirt t1 =(Tshirt) AmezonFactory.getData("Tshirt");
		t1.getDetails();
		Jeans t2 =(Jeans) AmezonFactory.getData("Jeans");
		t2.getDetails();
		Trouser t3 =(Trouser) AmezonFactory.getData("Trouser");
		t3.getDetails();
	}

}
