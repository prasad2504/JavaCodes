public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("hello");
		s1.append(" java");
		s1.delete(1, 4);
//		s1.reverse();
		System.out.println(s1);
	}
}
