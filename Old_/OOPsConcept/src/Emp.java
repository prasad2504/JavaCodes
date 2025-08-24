
public class Emp {
	
	int empid;
	String empname;
	int  salary;
	String dept;
	
	public void setData() {
		empid = 1 ;
		empname = "prasad";
		salary = 85000;
		dept = "development";
	}
	
	public void printData() {
		System.out.println("Employee_id :" + empid);
		System.out.println("Employee_name :" + empname);
		System.out.println("Salary :" + salary);
		System.out.println("Department :" + dept);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp a = new Emp();
		a.setData();
		a.printData();
		
	

	}

}
