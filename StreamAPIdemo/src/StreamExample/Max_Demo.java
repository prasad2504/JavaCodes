package StreamExample;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Max_Demo {

	public static void main(String[] args) {
		List<Employee2> list=new ArrayList<>();
		
		list.add(new Employee2(1,"Aniket",90000.0));
		list.add(new Employee2(2,"Nilesh",876048.78));
		list.add(new Employee2(3,"Niranjan",948575.38));
		list.add(new Employee2(4,"Manav",2746484.57));
		
		//list.stream().map((i)->new StringBuffer(i.name).toString().toUpperCase()).forEach((i)->System.out.println(i));
		
		 Optional<Object> s= list.stream().max(new idCompare()).filter((i)->i.salary>85000).map((i)->new StringBuffer(i.name).toString().toUpperCase());
		 System.out.println(s);
		 
		 
		//list.stream().max(new idCompare()).forEach((i)->System.out.println(i.salary));
		
		
	
	}

}
class Employee2{
	int id;
	String name;
	double salary;
	
	public Employee2(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

class idCompare implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		// TODO Auto-generated method stub
		return (int) (o1.salary-o2.salary);
	}
	
}