

public class SimMobileDemo {

	public static void main(String[] args) {
		Mobile m1 = new Mobile(101,"oneplus",25000);
		
		//syntax of inner class
		//outerclass.innerclass innerobject = outerobject.new innerclass;
		
		Mobile.Sim s1 = m1.new Sim(1,"airtel","esim");
		System.out.println(s1);
	
	}
}

