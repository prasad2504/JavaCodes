
public class Bottle {
	String size;
	String color;
	double price;
	
	
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//default constructor 
	public Bottle(){
		System.out.println("PRASAD");
		size = "small";
		color = "white";
		price = 10;
	}
	
	//parameteries
	
	public Bottle(String s,double p,String c) {
		size = s;
		price = p;
		color = c;
		
		
	}
	public static void main(String[] args) {
		
		Bottle p = new Bottle();
		System.out.println(p.getColor());
		
		Bottle p1=new Bottle("medium" , 50.50 , "black");
		System.out.println(p1.getColor());
		
	}
}
