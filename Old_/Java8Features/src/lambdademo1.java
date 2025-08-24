
public abstract class lambdademo1 implements Shape {
	
	public static void main(String[] args) {
		
		Shape t1 =  ()->{
				System.out.println("drawing a circle");
		
		};
		t1.draw();
		
		
		Shape t2=()->{
			System.out.println("drawing a rectangle");
			
	   };
	   t2.draw();
	    		
	}

}
