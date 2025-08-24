
public class Emp1 {
	
	int empid;
	String empname;
	int  salary;
	String dept;
	
	public void setEmpid(int e) {
		empid = e;
	}
	public int getEmpid() {
		return empid;
	}
	
	public void setEmpname(String c) {
		empname= c;
	}
	public String getEmpname() {
		return empname;
	}
	
	public void setSalary(int s) {
		salary = s;
	}
	public int getsalary() {
		return salary;
	}
	
	
	public void setDept(String d) {
		dept= d;
	}
	public String getDept() {
		return dept;
	}
	
	public void printData() {
		System.out.println("Emplooye_id :" + empid);
		System.out.println("Employye Name :" + empname);
		System.out.println("Salary :" + salary);
		System.out.println("Department :" + dept);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp1 a = new Emp1();
		Emp1 b = new Emp1();
		//a.setData();
		
		
		a.setEmpid(1);
		a.setEmpname("prasad");
		a.setSalary(50000);
		a.setDept("Dev");
		a.printData();
		
		b.setEmpid(2);
		b.setEmpname("suraj");
		b.setSalary(40000);
		b.setDept("Testing");
		b.printData();
		
		
		

	}

}
