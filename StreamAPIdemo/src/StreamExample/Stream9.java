package StreamExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Stream9 {
	
	public static void main(String[] args) {
		
		List<Employee> list =new ArrayList<>();
		
		
		for(int i=1;i<=125;i++) {
			list.add(new Employee( i , "a2gmail"+i+".com" , "p"+i ,Math.round((Math.random() * 4 + 1) * 10.0) / 10.0 , i+20000.0));
			
			//Math.round((Math.random() * 4 + 1) * 10.0) / 10.0 
			//math.random() -> gives us 0.0 to 1.0 range
			//math.random()*4 -> gives us range upto 4.0 // +1 gives upto 5.0
			//why math.random()*5 is not given by us coz it gives us range upto 4.99999 not 5.0 included so thats why 
			//now math.random()*4+1   *10 ->  we are doing *10 coz we are getting num like 2.461475 more numbers after decimal
			//so we dont want that so we shift decimal forwaoed then we get 24.61475 now 
			//math.round -> it give us nearest number of our random num now it give us 24 only
			//now we are /10 so it give us -> number likev 2.4 and now its looks like rating so the above all like we are writing
			
			
			
		}
		
		//que 1 
		list.stream()
		.sorted()
		.forEach((i)->System.out.println(i));
		
		//why it is not strated from 125
		
		System.out.println("************************************************");
		
		
		//que2
		list.stream()
		.map((emp)->new StringBuffer(emp.email).toString().toCharArray().length)
		.forEach((i)->System.out.println( "lenght of email:" +i));
		
		System.out.println("************************************************");

	
		//que2
		list.stream()
		.map((i)->new StringBuffer(i.email).length())
		.forEach((i)->System.out.println(i));
		
	
		
		System.out.println("************************************************");

		
		//que3
		list.stream()
		.map((i)->i.email.toUpperCase()).forEach((i)->System.out.println(i));
		
		System.out.println("************************************************p");

		
	
		 
		//quef  (StackOverFlow)
		list.stream().sorted(Comparator.comparingDouble((i)->i.salary)).limit(10).forEach((i)->System.out.println(i));

		list.stream()
	    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
	    .limit(10)
	    .forEach(System.out::println);
		
		
		
		System.out.println("#####################################");
		
		BinaryOperator<Double> bin = (i,j)->i+j;
		
		//que first10 high salary.
	    
		double d = list.stream().sorted().limit(10).map((i)->i.salary).reduce(0.0,bin);
		System.out.println(d);
	
		
//	-------------------------------------------------------------------------------------	
//		list.stream().sorted(Comparator.comparingDouble((i)->i.salary)).forEach((i)->System.out.println(i));
		
//		list.stream()
//	    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
//	    .forEach(System.out::println);
//		--------------------------------------------------------------------------------------
		
		
		//que d , que e , que g (sir)
		

		
	}

}


class Employee implements Comparable<Employee> {
	
	
	int id;
	String email;
	String name;
	Double rating;
	Double salary;
	
	
	public Employee(int id,String email,String name,Double rating,Double salary) {
		this.id=id;
		this.email=email;
		this.name=name;
		this.rating=rating;
		this.salary=salary;
	}
	
	
	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public Double getRating() {
		return rating;
	}

	public Double getSalary() {
		return salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", email=" + email + ", name=" + name + ", rating=" + rating + ", salary="
				+ salary + "]";
	}


	@Override
	public int compareTo(Employee o) {
		return (int) (o.salary-this.salary);
	}
	
	
	
	
	
}