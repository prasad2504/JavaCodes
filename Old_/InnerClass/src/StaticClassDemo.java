
public class StaticClassDemo {
	public static void main(String[] args) {
		
		
		//syntax of static inner class
		//outerclass.innerclass innerobject = new innerclass.outerclass
		
		Bank.DemandDraft d1 = new Bank.DemandDraft(103, "BOI", 7450);
		System.out.println(d1);
	}

}
