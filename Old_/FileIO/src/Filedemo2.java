import java.io.FileWriter;
import java.io.IOException;

public class Filedemo2 {

	public static void main(String[] args) {
		
		//try with resources
		//if we are using try with resources means we are writing inside try() 
		//then there is no need to close that resource
		
		try(FileWriter f1 = new FileWriter("resume.txt")){
			f1.write("name:Prasad");
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.printf("%5d%f%s");
		}
	}
}
