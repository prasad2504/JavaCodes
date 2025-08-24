
public class Product {
 
	int pno;
	String name;
	float price;
	
	//getter setter method
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	//default constructor
	public Product() {
		super();
	}
	
	//paarameteriesed contructor
	public Product(int pno, String name, float price) {
		super();
		this.pno = pno;
		this.name = name;
		this.price = price;
	}
	
	//tostring method
	@Override
	public String toString() {
		return "Product [pno=" + pno + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
