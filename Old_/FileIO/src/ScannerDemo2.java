import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) throws IOException {
		
		//try with 
		
		
		try(FileReader f1 = new FileReader("student.txt");){
		Scanner sc = new Scanner(f1);
		String s1;
		while(true) {
			try {
				s1 = sc.nextLine();
				System.out.println(s1);
			}
			catch (NoSuchElementException e){
				f1.close();
			}
		}
		} 
	}
}
