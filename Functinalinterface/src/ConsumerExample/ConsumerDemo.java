package ConsumerExample;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		abc abc= new abc();
		abc.accept(12);
		
	}
}


class abc implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		
		System.out.println(t*2);
		
	}
	
}