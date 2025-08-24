import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLDemo2 {

	public static void main(String[] args) {
		
		//step1 register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step2 establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prasad","root","root");
			
		//step3 create statement
			Statement stmt = con.createStatement();
		//step4 excute query
			stmt.executeUpdate("insert into staff values(1,'riyu',23,'pune',55000)");
			
		//step5 close connection	
//			con.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		
		
	
		
	}
}
