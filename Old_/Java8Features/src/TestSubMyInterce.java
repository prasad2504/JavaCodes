
public class TestSubMyInterce{
	
	public static void main(String[] args) {
		SubMyInterface p1 = (s1)->{
			
			int rev = 0;
			while(s1>0) {
				int d = s1%10;
				rev = rev*10+d;
				s1=s1/10;
			}
					
			return rev;
		};
		
		System.out.println(p1.reverse(2504));
		p1.test();
		
		
		MyInterface.show();
		SubMyInterface.show();
	}

}
