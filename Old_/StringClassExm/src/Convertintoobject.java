
public class Convertintoobject {
	public static void main(String[] args) {
		int x = 50;//primitive int variable
		Integer i1=x;//converting from primitive to object
		
		System.out.println(x);
		System.out.println(i1);
		
		
		
		String n ="1204";
		int no = Integer.parseInt(n);
		System.out.println(n);
		
		String n2 = "4252.255";
		float f =Float.parseFloat(n2);
		System.out.println(n2);
		
		Integer i2=Integer.valueOf(no);
		System.out.println(no);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		
		char ch='8';
		System.out.println(Character.isDigit(ch));
		
		char ch2='t';
		System.out.println(Character.isUpperCase (ch2));
		
	}
}

