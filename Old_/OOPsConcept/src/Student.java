
public class Student {
	int no;
	String name;
	int marks;
	
	public void setData() {
		no =25;
		name = "prasad";
		marks =90;
	}
	
	public void printdata() {
		System.out.println("roll_no :" + no);
		System.out.println("name :" + name);
		System.out.println("marks :" + marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student a = new Student();
		a.setData();
		a.printdata();

	}

}
