
public class Test2 {
	
	public static void sum(int a , int b) {
		System.out.println("Sum :" +  a+b);
	}
	
	public static void sum(int a , int b, int c) {
		System.out.println("sum of 3 :" + a+b+c);
	}
	
	public static void sum(int ...t) {
		System.out.println("Length of number :"
				+ "" +t.length);
		//System.out.println();
		int sum=0;
		for (int i=0;i<t.length;i++) {
			System.out.println(t[i]);
			sum = sum+t[i];
			
		}
		System.out.println("sum :" +sum);
	}
	public static void main(String[] args) {
	     Test2.sum(1,2);	
	     Test2.sum(1,2,5);
	     Test2.sum(1,4,5,7,8,9,5);
	}

}



