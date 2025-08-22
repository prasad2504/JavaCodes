package StreamExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream8 {
	
	public static void main(String[] args) {
		
		List<Empp> list = new ArrayList<>();
		list.add(new Empp(1,"prasad"));
		list.add(new Empp(2,"abc"));
		list.add(new Empp(3,"xyz"));
		
		
		list.add(new Empp(4,"dgf"));
		list.add(new Empp(5,"PRASAD"));
		list.add(new Empp(6,"vwx"));
		
		
		list.stream()
		.sorted()
		.limit(2)
		.skip(1)
		.forEach((i)->System.out.println(i));
		
		System.out.println("____________________");
		
		list.stream()
		.sorted()
		.limit(2)
		.skip(1)
		.map((i)->new StringBuffer(i.name).reverse()).forEach((i)->System.out.println(i));
		
		
		
		
		
		
	}

}



class Empp implements Comparable <Empp>
{
	
	int id;
	String name;
	
	public Empp(int id, String name) {
		
		this.id=id;
		this.name=name;
		
	}




	@Override
	public String toString() {
		return "Empp [id=" + id + ", name=" + name + "]";
	}




	@Override
	public int compareTo(Empp o) {
		
		return o.id-this.id;
	}
	
	

	
}

