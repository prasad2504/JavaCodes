package Revision;

import java.util.HashMap;
import java.util.Map;

public class CustomKey {
	
	public static void main(String[] args) {
		
		Map <Emp,String> h1 = new HashMap<Emp , String>();
		
		h1.put(new Emp(1,"Prasad"), "dhasade");
		h1.put(new Emp(2,"riyu"), "cutie");
		
		System.out.println(h1.size());
		System.out.println(h1);
		
	}

}


class Emp {
	
	int id;
	String name;
	
	
	public Emp (int id, String name){
		
		this.id=id;
		this.name=name;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}


	
	
}
