import java.io.File;

public class FileClassDemo {

	public static void main(String[] args) {
		File f1 = new File("resume.txt");
		System.out.println(f1.length());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getName());
		System.out.println(f1.getParent());
		System.out.println(f1.getTotalSpace());
		System.out.println(f1.isFile());
		
		
		File f2 = new File("sample");
		System.out.println(f2.isFile());
		System.out.println(f2.isDirectory());
		
	}
}
