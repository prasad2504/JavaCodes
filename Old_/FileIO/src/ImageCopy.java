import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
	
	public static void main(String[] args) {
		
		
		try {
			FileInputStream f1 = new FileInputStream("parrot.jpg");
			FileOutputStream f2 =  new FileOutputStream("Myimg.jpg");
			byte[] b1= f1.readAllBytes();
			f2.write(b1);
			f1.close();
			f2.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
