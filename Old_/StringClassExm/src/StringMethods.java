import java.util.Arrays;
public class StringMethods {
	
	public static void main(String[] args) {
		
		//String s1 = "i am prasad i am studing masters";
//		String [] op = s1.split(",");
		
		String s1 = "i, am, prasad,i ,am, studing, masters";
		String [] op = s1.split("");
		
		for(int i=0;i<op.length;i++) {
			System.out.println(op[i]);
		}
		
		
	}
}
