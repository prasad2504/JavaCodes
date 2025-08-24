
public class Exam extends Student{
	
	int mark1;
	int mark2;
	
	public void setMarks(int mark1, int mark2) {
		this.mark1=mark1;
		this.mark2=mark2;		
	}
	
	public void showMarks() {
		System.out.println("Marks1 :" + mark1);
		System.out.println("Marks2 :" + mark2);
	}
	
	
}
