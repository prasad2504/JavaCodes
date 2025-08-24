
public class Car {
	int price;
	String brand;
	String color;
	int millenge;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMillenge() {
		return millenge;
	}
	public void setMillenge(int millenge) {
		this.millenge = millenge;
	}
	public Car(int price, String brand, String color, int millenge) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.millenge = millenge;
	}
	
	public Car() {
		
	}
	
	public String toString() {
		return "Price : " +this.price + 
				" brand : " + this.brand + 
				" color : " + this.color + 
				" millenge : " +this.millenge;
	}
	
	
	
}
