import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MYSQLDemo3 {

	public static void main(String[] args) {
		
		//step1 register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step2 establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prasad","root","root");
			
		//step3 create statement
			PreparedStatement pstmt = con.prepareStatement("insert into staff values(?,?,?,?,?)");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter");
			int i = sc.nextInt();
			String n = sc.next();
			int a = sc.nextInt();
			String p = sc.next();
			int s = sc.nextInt();

			
			pstmt.setInt(1,i);
			pstmt.setString(2,n);
			pstmt.setInt(3, a);
			pstmt.setString(4, p);
			pstmt.setInt(5,s);
			
			
		//step4 excute query
			pstmt.executeUpdate();
			
		//step5 close connection	
//			con.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
		
	
		
	}
}
