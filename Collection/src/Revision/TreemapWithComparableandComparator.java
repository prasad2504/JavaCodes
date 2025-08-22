package Revision;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreemapWithComparableandComparator {
	
	public static void main(String[] args) {
		
		Map <Leader , String> m1 =new TreeMap<Leader , String>(new nameComparator());
		m1.put(new Leader(1,"Prasad"), "Dhasade");
		m1.put(new Leader(2,"riyuuuuuuu"), "Princess");
		
		
		System.out.println(m1);
		
		
		
		
		
	}

}

class Leader implements Comparable <Leader> {
	int id;
	String name;
	
	public Leader(int id , String name) {
		this.id=id;
		this.name=name;
	}
	

	@Override
	public int compareTo(Leader o) {
		if(this.id<o.id) {
			return 1;
		}
		if (this.id>o.id) {
			return -1;
		}
		return 0;
		
	}
	public String toString() {
		return " id : " + id +  "\n"+ " name : " +name + "\n" + "Role" + " "  +"";
	}

}


class nameComparator implements Comparator <Leader>{

	@Override
	public int compare(Leader o1, Leader o2) {
		// TODO Auto-generated method stub
		return o2.name.length()-o1.name.length();
	}
	
}
