


//map , filter , sorted -> intermediatory

// count 

//foreach

//max , min -> comparator

//skip , limit


package StreamExample;

import java.util.ArrayList;
import java.util.List;

public class Stream6 {

	public static void main(String[] args) {
		
		List<Emp> list = new ArrayList<>();
		
		list.add(new Emp(1,"prassad" , 904213.56));
		list.add(new Emp(2,"abc" , 45612.232));
		list.add(new Emp(3,"xyz",99875.1545));
		
		list.stream().filter((em)->em.id>2).forEach((i)->System.out.println(i.name + " " + i.id));

	}

}

class Emp {
	
	int id;
	String name;
	double salary;

	public Emp(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	
	public double getSalary() {
		return salary;
	}

	
	
}