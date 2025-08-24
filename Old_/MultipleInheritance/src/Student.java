
public class Student {
	
	int roll;
	String name;
	
	public void setData(int roll , String name) {
		
		this.roll = roll;
		this.name = name;
	}
	
	public void showData() {
		
		System.out.println("Roll number of Student :" + roll);
		System.out.println("Name of the Student : " + name);
	}
 
}
