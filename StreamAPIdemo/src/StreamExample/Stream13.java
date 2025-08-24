package StreamExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stream13 {

	public static void main(String[] args) {

		
		List<Employee1> list = new ArrayList<>();
		list.add(new Employee1(1,"John", 120.201,"IT"));
		list.add(new Employee1(2,"prasad",99999.99,"Development"));
		list.add(new Employee1(3,"Abc", 120.201,"IT"));
		list.add(new Employee1(4,"yash",99999.99,"Development"));
		list.add(new Employee1(5,"xyz",68534.56,"HR"));
		list.add(new Employee1(6,"kgf",65412.122,"HR"));
		
		
		
		
//		System.out.println(list.stream()
//		.distinct()
//		.peek((i)->System.out.println(i))
//		.max(new salarycom()));
		
		
		list.stream().sorted(new salarycom()).distinct().forEach((i)->System.out.println(i));
		
	}

}


class Employee1 {
	
	int id;
	String name;
	double salary;
	String dept;
	
	
	public Employee1(int id,String name,double salary,String dept) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
		
	}


	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	public boolean equals(Object o) {
		
		Employee1 emp = (Employee1)o;
		
		if(this.dept.equals(emp.dept)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int hashCode() {
		return 1;
	}
	
}

class salarycom implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return (int) (o1.salary-o2.salary);
	}
	
}


