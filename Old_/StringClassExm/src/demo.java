
public class demo {
	
	public static void main(String[] args) {
		String s1="Hello";
		String s2 = new String("java");
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.codePointAt(0));
		System.out.println(s1.length());
		System.out.println(s1.concat(s2));
		System.out.println(s1.endsWith(s2));
		System.out.println(s1.endsWith("o"));
//		System.err.println(s1.equals(s2));
		System.out.println(s1.equals(s1));
		System.out.println(s1.indexOf("el"));
		System.out.println(s1.repeat(6));
		System.out.println(s1.replace("ll", "pp"));
		System.out.println(s1.substring(2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println();
	}

}
