package StreamExample;

import java.util.ArrayList;
import java.util.List;

public class Stream12 {

	public static void main(String[] args) {
		
		List<Playerr> player = new ArrayList<>();
		player.add(new Playerr(1,"rohit","sharma",45));
		player.add(new Playerr(2,"Virat", "kohli" , 18));
		player.add(new Playerr(3,"Mahindrasingh" ,"Dhoni",07));
		player.add(new Playerr(1,"rohit","sharma",45));
		player.add(new Playerr(2,"Hardik", "Pandya" , 33));

		
		
		
		player.stream().distinct().forEach((i)->System.out.println(i));
		//this printing rohit sharma twice so keep in mind wheneveer we are using custom classes and then disctict
		//always overide the .equals and .hashcode methods 
		//hashcode for their refernce
		//.equals for the content
		
		
		
	}

}


class Playerr{
	int id;
	String name;
	String lastname;
	int J_no;
	
	
	public Playerr(int id,String name,String lastname,int J_no) {
		this.id=id;
		this.name=name;
		this.lastname=lastname;
		this.J_no=J_no;
		
	}


	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", lastname=" + lastname + ", J_no=" + J_no + "]";
	}
	
	public boolean equals(Object o) {
		
		Playerr player = (Playerr)o;
		
//		if(this.id==player.id && this.name.equals(player.name)) {
//			return true;
//		}
		
		if(this.id==player.id) {
			return true;
		}
		
		return false;
		
		
	}
	
	public int hashCode() {
		return 1;
		
	}
	
	
}