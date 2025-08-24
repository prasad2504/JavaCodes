import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCount {

  public static void main(String[] args) {
    
  
    try {
      FileReader f1 = new FileReader("student.txt");
    //  FileWriter f2 = new FileWriter("newstudent.txt");
      
      int ch;
      int s=0,c=0,d=0,sp=0 ;
      while(true) {
        ch = f1.read();
        if(ch>=97 && ch<=122) {
          s++;
        }
        
        //else if(ch>=54 && ch<=90) {
        else if(Character.isUpperCase(ch)) {
          c++;
        }
        else if(ch>=48 && ch<=57) {
          d++;
        }
        else if(ch==' ') {
          sp++;
        }
        if(ch==-1) {
          break;
        }
        
        
        
      }
      System.out.println("Small letter :" +s);
      System.out.println("Capital letter :" +c);
      System.out.println("digit no :" +d);
      System.out.println("Space :" +sp);
      f1.close();
     // f2.close();
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