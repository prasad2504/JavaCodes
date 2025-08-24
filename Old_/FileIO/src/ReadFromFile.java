import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
	
	public static void main(String[] args) {
		FileReader f1;
		int ch=0;
		
		try {
			f1 = new FileReader("student.txt");
			while (true) {
				ch = f1.read();
				if(ch ==-1) {
				//System.out.println(" end of file");
				break;
				}
			
			System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
