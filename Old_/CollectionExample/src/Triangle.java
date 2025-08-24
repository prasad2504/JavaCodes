class Triangle{
	
	double a,b,c;


	public void setA(double a) {
		this.a = a;
	}



	public void setB(double b) {
		this.b = b;
	}

	

	public void setC(double c) {
		this.c = c;
	}
	
	public double getArea() {
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
		
		
	}
	
	public static void main(String[] args) {
		
		Triangle t1 = new Triangle();
		
		
		
	}
}