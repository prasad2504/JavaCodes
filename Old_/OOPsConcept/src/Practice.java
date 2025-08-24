
public class Practice {
	
	String itemname;
	int order_id;
	static String hotelname ="Atithi pure veg";
	
	public void setDeOr(String Food,int Num) {
		itemname = Food;
		order_id = Num;
		
	}
	
	static public void stc() {
		System.out.println("Hotel Name :" + hotelname);
	}
	
	public void dis() {
		
		stc();
		System.out.println("Food :" + itemname);
		System.out.println("Num :" + order_id);
		System.out.println("");
	}

	
}


