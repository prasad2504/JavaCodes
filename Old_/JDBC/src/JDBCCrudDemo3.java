import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCCrudDemo3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opt;
		
		do {
			System.out.println("1. Insert");
			System.out.println("2. Read");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("9.exit");
			System.out.println("enter the opt");
			opt=sc.nextInt();
			switch(opt) {
			
				case 1 : insert();
					break;
				case 2 : read();
					break;
				case 3 : update();
					break;
				case 4 : delete();
					break;
				
			}
			
		}while(opt==9);
		
		
	}

	
	private static void delete() {
		Scanner sc = new Scanner (System.in);
		// TODO Auto-generated method stub
		try {
			   Connection con = getConnection();
			   String qry = "delete from staff where staff_id=?";
			   PreparedStatement pstmt = con.prepareStatement(qry);
			   
			   System.out.println("Enter the staff_id to delete ");
			   int i= sc.nextInt();
			   
			   pstmt.setInt(1,i);
			   pstmt.executeUpdate();
			   System.out.println("1 Record deleted");
			   }
			   catch(Exception e) {
			    System.out.println(e);
			   }
	}


	private static void update() {
		Scanner sc = new Scanner(System.in);

		// TODO Auto-generated method stub
		 try {
			   Connection con = getConnection();
			   String qry = "update staff set staff_name=? , staff_age=? ,  where staff_id=?";
			   PreparedStatement pstmt = con.prepareStatement(qry);
			   
			   System.out.println("Enter the staff_id to update ");
			   int i= sc.nextInt();
			   
			   System.out.println("Enter the new staff_name ");
			   String n = sc.next();
			   
			   System.out.println("Enter the new staff_age ");
			   int a = sc.nextInt();
			   
//			   System.out.println("Enter the new staff_add ");
//			   String s = sc.next();
//			   
//			   System.out.println("Enter the new salary ");
//			   int p = sc.nextInt();
			   
			   pstmt.setString(1,n);
			   pstmt.setInt(2,a);
			   pstmt.setInt(3,i);
//			   pstmt.setString(4, s);
//			   pstmt.setInt(5, p);
			   
			   
			   pstmt.executeUpdate();
			   System.out.println("1 Record updated");
			   }
			   catch(Exception e) {
			    System.out.println(e);
			   }
	}


	private static void read() {
		// TODO Auto-generated method stub
		  try {
			   Connection con = getConnection();
			   String qry = "select * from staff";
			   PreparedStatement pstmt = con.prepareStatement(qry);
			   ResultSet rs = pstmt.executeQuery();
			   while(rs.next()) {
			    //System.out.println(rs.getInt(1)+ rs.getString(2)+ rs.getInt(3));
			    System.out.println(rs.getInt("staff_id")+"  " +  rs.getString("staff_name")+ "  " + rs.getInt("staff_age")+ " " + rs.getString("staff_add")+ " " + rs.getInt("salary"));
			   }
			  }
			  catch(Exception e) {
			   System.out.println(e);
			  }
	}


	//insert record
	private static void insert() {
		// TODO Auto-generated method stub
		try {
			Connection con = getConnection();
			String qry = "insert into staff values(?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(qry);
			
			System.out.println("enter the id,name,age,city,salary");
			
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			String n = sc.next();
			int a = sc.nextInt();
			String c = sc.next();
			int s = sc.nextInt();
			
			pstmt.setInt(1, i);
			pstmt.setString(2, n);
			pstmt.setInt(3, a);
			pstmt.setString(4, c);
			pstmt.setInt(5, s);
			
			pstmt.executeUpdate();
			System.out.println("1 Record Inserted");
			
		}catch (Exception e){
			System.out.println(e);
		}
		
		
		
	}


	private static Connection getConnection() {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prasad","root","root");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
