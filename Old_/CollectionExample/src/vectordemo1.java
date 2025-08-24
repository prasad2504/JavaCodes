import java.util.Vector;

public class vectordemo1 {
	
	public static void main(String[] args) {
		Vector v1 =new Vector();
		System.out.println("Vector capacity : "+v1.capacity());
		v1.add(10);
		v1.add(14);
		v1.add(65);
		v1.add(54);
		v1.add(98);
		v1.add(78);
		v1.add(32);
		v1.add(25);
		v1.add(12);
		v1.add(48);
		System.out.println("Vector capacity : "+v1.capacity());
		v1.add(20);
		System.out.println("Vector capacity : "+v1.capacity());
		System.out.println("Vector Size :" +v1.size());
	}

}
