//singletone pattern 
//private constructor create 
public class SingleTonPattern {
	
	static SingleTonPattern s1 = null;
	
	SingleTonPattern() {
		
	}

	static SingleTonPattern getObject() {
		
		if (s1 == null) {
		
			s1= new SingleTonPattern();
			
		}		
		return s1;
		
	}
	
}
