import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	
	public static void main(String[] args) throws IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter your name");
		 String n = br.readLine();
		 
		 
		 
		System.out.println("enter your age");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Hello " + n + " welcome");
		System.out.println("your age is : " +a);
		 
		 
	}

}
