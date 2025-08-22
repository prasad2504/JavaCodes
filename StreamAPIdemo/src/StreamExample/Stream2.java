package StreamExample;

import java.util.ArrayList;
import java.util.List;

public class Stream2 {
	public static void main(String[] args) {
		
		
		List<Player> li = new ArrayList();
		
		li.add(new Player(1,"prasad"));
		li.add(new Player(2,"yash"));
		
		li.stream().forEach((i)->
			System.out.println(i.id+1)
		);
	}
}

class Player {
	
	int id;
	String name;
	
	
	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}