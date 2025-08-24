
public class Area {
	
	//area of circle
	public void area(float radius) {
		System.out.println("area of circle " + Math.PI*radius*radius);
		
	}

	//area of rectangle
	public void area(int l,int b) {
		System.out.println("area of rectangle :" + 2*(l+b));
	}
	
	//area of triangle
	public void area(double base ,double heigth) {
		System.out.println("tringle :" + base*heigth /2);
		
	}
	
	//area of square
	public void area(double side) {
		System.out.println("square : " +side*side);
		
	}
	
	
	public static void main(String[] args) {
		
		Area p = new Area();
		p.area(2.1f);
		p.area(1,1);
		p.area(1.2, 1.5);
		p.area(5.5);
	}

}
