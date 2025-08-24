
public class ArrayDemo {

	
	public static void main(String[] args) {
		
	//	int [] a =new int[8];
	//String [] friends = new String[10];
		Product [] cart = new Product[12];
		
		
		Product p1 = new Product(101,"shoes",4565);
		Product p2 = new Product(102,"shoes",4565);
		Product p3 = new Product(103,"shoes",4565);
		Product p4 = new Product(104,"shoes",4565);
		Product p5 = new Product(105,"shoes",4565);
		Product p6 = new Product(106,"shoes",4565);
		Product p7 = new Product(107,"shoes",4565);
		Product p8 = new Product(108,"shoes",4565);
		Product p9 = new Product(109,"shoes",4565);
		Product p10 = new Product(110,"shoes",4565);
		Product p11 = new Product(111,"shoes",4565);
		Product p12 = new Product(112,"shoes",4565);
//		Product p1 = new Product(101,"shoes",4565);
	//	Product p1 = new Product(101,"shoes",4565);

		
		cart[0]=p1;
		cart[1]=p2;
		cart[2]=p3;
		cart[3]=p4;
		cart[4]=p5;
		cart[5]=p6;
		cart[6]=p7;
		cart[7]=p8;
		cart[8]=p9;
		cart[9]=p10;
		cart[10]=p11;
		cart[11]=p12;
		
//		for(int i=0;i<12;i++) {
//			System.out.println(cart[i]);
//		}
		
		//for each loop
		for(Product p:cart) {
			System.out.println(p);
		}

	}
}
