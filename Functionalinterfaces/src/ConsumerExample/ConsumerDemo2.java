package ConsumerExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo2 {

	public static void main(String[] args) {
		
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		abcc abc= new abcc();
		abc.accept(list);
	}
}


class abcc implements Consumer<List<Integer>>{

	

	@Override
	public void accept(List<Integer> t) {
		
		for(Integer i:t) {
			System.out.println(i*2);
		}
		
	}
	
}