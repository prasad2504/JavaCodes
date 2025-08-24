import java.util.Scanner;

public class Area {
	
	int length;
	int breadth;
	
	public void setDim(int length, int breadth ) {
		
		this.length = length;
		this.breadth = breadth;
		
		
	}
	
	
	

	public int getArea() {
		
		return length*breadth;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter l  and b");
		
		int l =sc.nextInt();
		int b =sc.nextInt();
		
		
		Area a =new Area();	
		a.setDim(l, b);		
		System.out.println("Area : " +a.getArea());
		
	}
}
