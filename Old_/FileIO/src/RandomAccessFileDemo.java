import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) {
		//file opening modes
		// r --> read
		// w --> write
		// a --> append
		
		try {
			RandomAccessFile f1 = new RandomAccessFile("student.txt","r");
			int ch;
			ch= f1.read();
			System.out.println((char)ch);
			f1.seek(7);
			ch=f1.read();
			System.out.println((char)ch);
			System.out.println(f1.getFilePointer());
			System.out.println(f1.length());
			f1.seek(f1.length()-3);
			System.out.println("3rd charcter :" +(char) f1.read());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
