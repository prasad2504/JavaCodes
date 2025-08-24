package SupplierExample;

import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		
		Supplier<Integer> sup = ()->{
			
			int a = (int) (Math.random()*10000);
			
			return a;
			
		};
		
		System.out.println(sup.get());
	}

}
