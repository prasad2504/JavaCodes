package Revision;

import java.util.HashSet;

public class Hashset {
	
	public static void main(String[] args) {
		
		
		Player one = new Player(45,"Rohit",264);
		Player second = new Player(33,"Hardik",91);
		Player third = new Player(55, "Pollard" , 87);
		Player fourth = new Player(55, "Pollard" , 87);
		
		
		
		HashSet<Player> s1=new HashSet<Player>();
		s1.add(one);
		s1.add(second);
		s1.add(third);
		s1.add(fourth);
		
		
		System.out.println(s1);
		
		
		//int this code even set does not contain duplicate then also it adds pollrad twice coz in this code we are generating two differnt obeject third and fourth and so jvm treat them like a different obj so they do not overirde 
		//solution - if you want to override with new value then you want to override the .equal and .hashcode 
		
		
		
		
	}

}

class Player {
	
	int number;
	String name;
	int score;
	
	
	public Player (int number , String name, int score) {
		
		this.number=number;
		this.name=name;
		this.score=score;
	}
	
	
	public String toString() {
		return " Number : " +number +"\n" + " Name : " +name +"\n" + " Score : " +score + "\n" + "------------------" + "\n";
	}
	
	
	
	//to solve the problem is pollard added twice now it does not going to happen.
	
	public int hashCode() {
		return 100;
		
	}
	
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		
		Player two = (Player)o;
		if(two.number==this.number) {
			return true;
		}
		return false;
	}
}
