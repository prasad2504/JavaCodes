import java.io.FileWriter;
import java.io.IOException;

public class Filedemo {

		public static void main(String[] args) {
			FileWriter f1=null;
			try {
			 f1 = new FileWriter("resume.txt");
			f1.write("age:22");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			try {
			f1.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
}
