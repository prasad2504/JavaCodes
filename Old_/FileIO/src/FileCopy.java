import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

  public static void main(String[] args) {
    
  
    try {
      FileReader f1 = new FileReader("student.txt");
      FileWriter f2 = new FileWriter("newstudent.txt");
      int ch;
      while(true) {
        ch = f1.read();
        if(ch==-1) {
          break;
        }
        f2.write((char)ch);
      }
      f1.close();
      f2.close();
      System.out.println("1 file is copied");
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    
    
    
  }  
}