package ConsumerExample;

import java.util.function.Consumer;

public class ConsumerChanning {
	
	public static void main(String[] args) {
		
		
		Consumer<Integer> cs = (t)->{System.out.println(t*10);};
		Consumer <Integer> cs2 = (t)->{System.out.println(t*20);};
		
		cs.andThen(cs2).accept(10);
		
		
		}

}
