package Revision;



import java.util.HashMap;
import java.util.Map;

public class CustomKey1 {
	
	public static void main(String[] args) {
		
		Map <Emp1,String> h1 = new HashMap<Emp1 , String>();
		
		//in this example when hashcode is same and .equals is same then value should override;
		
		h1.put(new Emp1(1,"Prasad"), "dhasade");
		h1.put(new Emp1(1,"Prasad"), "riyuuu");
		
		System.out.println(h1.size());
		System.out.println(h1);
		
	}

}


class Emp1 {
	
	int id;
	String name;
	
	
	public Emp1 (int id, String name){
		
		this.id=id;
		this.name=name;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	public int hashCode(){
		return 100;
	}
	
	public boolean equals (Object o) {
		
		if(this==o) {
			return true;
		}
		Emp1 two = (Emp1)o;
		
		
		if(two.id==this.id) {
			return true;
		}
		
		return false;
		
	}


	
	
}
