package ConsumerExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class InterviewQue {
	
	public static void main(String[] args) {
		
		
		List<String> ls = new ArrayList<String>();
		ls.add("muMbAi");
		ls.add("sAtArA");
		ls.add("PunE");
		
		Consumer cs = (li)->{
			
			for(String i:ls) {
				System.out.println(i.toUpperCase());
			}
		};
		
		cs.accept(ls);
	}

}
