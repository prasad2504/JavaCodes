package example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Hw {
	public static void main(String[] args) {
		
		
		List<Product>monday = new ArrayList<>();
		monday.add(new Product(1,"tv",521.3200));
		monday.add(new Product(2,"fan",6584.32));
		monday.add(new Product(3,"washingMachine",7845.56));
		monday.add(new Product(10,"abc",10845.56));

		
		
		List<Product>tuesday = new ArrayList<>();
		tuesday.add(new Product(4,"mobile",99865.1));
		tuesday.add(new Product(5,"Watch",854.21));
		tuesday.add(new Product(6,"buds",980.2));
		
		List<Product>wed = new ArrayList<>();
		wed.add(new Product(7,"ipad",897.56));
		wed.add(new Product(8,"pen",741.0));
		wed.add(new Product(9,"charger",985.12));
		
		List<List<Product>> allpro = new ArrayList();
		allpro.add(monday);
		allpro.add(tuesday);
		allpro.add(wed);
		
		
		
		
//		Function<List<Product>,Product> fun = (i)->i.stream().sorted((p1,p2)->p1.price- p2.price);
 		Consumer<List<Product>> con = (i)->i.stream().sorted((p1,p2)->Double.compare( p2.price, p1.price)).skip(1).limit(1).forEach((j)->System.out.println(j));;
//		con.accept(monday);
//		con.accept(tuesday);
//		con.accept(wed);
		
		
		allpro.stream().forEach(con);
	  
	}

}


class Product{
	
	
	int id;
	String name;
	double price;
	
	public Product(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}

