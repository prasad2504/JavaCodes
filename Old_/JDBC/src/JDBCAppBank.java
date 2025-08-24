import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBCAppBank {
 static Scanner sc;
 public static void main(String[] args) {
  createTable();
  int opt=0;
  do {
   System.out.println();
   System.out.println("1. Add new bank account ");
   System.out.println("2. Show all bank accounts ");
   System.out.println("3. Delete Bank account ");
   System.out.println("4. Update Bank account ");
   System.out.println("5. Deposit amount ");
   System.out.println("6. Withdraw amount ");
   System.out.println("7. Show balance ");
   System.out.println("8. Show total amount ");
   System.out.println("10. Exit");
   System.out.println("Enter your option ");
   sc = new Scanner(System.in);
   opt=sc.nextInt();
   switch(opt) {
   case 1:addAccount();
     break;
   case 2: showAllAccounts();
     break;
   case 3 : delete();
   break;
   case 4: Update();
   break;
   case 5: deposite();
   break;
   case 6 : withdrew();
   break;
   case 7 : showbalance();
   break;
   case 8 : Totalamount();
   break;
   
   }
  }while(opt!=10);
 }

 private static void Totalamount() {
	// TODO Auto-generated method stub
	 try {
	        Connection con = MyConnection.getConnection();
	        String qry = "SELECT SUM(balance) AS total FROM bankaccount";
	        PreparedStatement pstmt = con.prepareStatement(qry);
	        ResultSet rs = pstmt.executeQuery();
	        if (rs.next()) {
	            float total = rs.getFloat("total");
	            System.out.println("Total amount in bank: ₹" + total);
	        }
//	        con.close();
	    } catch (Exception e) {
	        System.out.println(e);
	    }
}

private static void Update() {
	// TODO Auto-generated method stub
	  System.out.println("Enter account number to update:");
	    int acno = sc.nextInt();
	    sc.nextLine(); // clear buffer
	    
	    System.out.println("Enter new name:");
	    String name = sc.nextLine();
	    System.out.println("Enter new address:");
	    String address = sc.nextLine();
	    System.out.println("Enter new phone:");
	    String phone = sc.nextLine();
	    try {
	        Connection con = MyConnection.getConnection();
	        String qry = "UPDATE bankaccount SET acname=?, address=?, phone=? WHERE acno=?";
	        PreparedStatement pstmt = con.prepareStatement(qry);
	        pstmt.setString(1, name);
	        pstmt.setString(2, address);
	        pstmt.setString(3, phone);
	        pstmt.setInt(4, acno);
	        int rows = pstmt.executeUpdate();
	        if (rows > 0) {
	            System.out.println("Account updated successfully.");
	        } else {
	            System.out.println("Account not found.");
	        }
//	        con.close();
	    } catch (Exception e) {
	        System.out.println(e);
	    }
}

private static void delete() {
	// TODO Auto-generated method stub
	 System.out.println("Enter the account number to delete:");
	    int acno = sc.nextInt();
	    try {
	        Connection con = MyConnection.getConnection();
	        String qry = "DELETE FROM bankaccount WHERE acno=?";
	        PreparedStatement pstmt = con.prepareStatement(qry);
	        pstmt.setInt(1, acno);
	        int rows = pstmt.executeUpdate();
	        if (rows > 0) {
	            System.out.println("Account deleted successfully.");
	        } else {
	            System.out.println("Account not found.");
	        }
//	        con.close();
	    } catch (Exception e) {
	        System.out.println(e);
	    }
}

private static void showbalance() {
	// TODO Auto-generated method stub
	  System.out.println("Enter the account number to show balance");
	    int a = sc.nextInt();
	    try {
	        Connection con = MyConnection.getConnection();
	        String qry = "SELECT balance FROM bankaccount WHERE acno=?";
	        PreparedStatement pstmt = con.prepareStatement(qry);
	        pstmt.setInt(1, a);
	        ResultSet rs = pstmt.executeQuery();
	        if (rs.next()) {
	            float balance = rs.getFloat("balance");
	            System.out.println("Current balance: ₹" + balance);
	        } else {
	            System.out.println("Account not found.");
	        }
//	        con.close();
	    } catch (Exception e) {
	        System.out.println(e);
	    }
}
 
 

private static void withdrew() {
	// TODO Auto-generated method stub
	  System.out.println("Enter the account number to withdraw");
	  int a=sc.nextInt();
	  try {
	   Connection con = MyConnection.getConnection();
	   String qry = "select * from bankaccount where acno=?";
	   PreparedStatement pstmt = con.prepareStatement(qry);
	   pstmt.setInt(1, a);
	   ResultSet rs = pstmt.executeQuery();
	   if(rs.next()) {
	    System.out.println("Enter the amount to withdraw ");
	    float x = sc.nextFloat();
	    float b = rs.getFloat(4);
	    if(b>x) {
	     b=b-x;
	     String q = "update bankaccount set balance=? where acno=?";
	     PreparedStatement pstmt2 = con.prepareStatement(q);
	     pstmt2.setFloat(1, b);
	     pstmt2.setInt(2,a);
	     pstmt2.executeUpdate();
	     System.out.println("Your withdraw transaction is successfull.");
	     System.out.println("Your new balance amount : " + b);
	   
	    }
	    else {
	     System.out.println("Invalid withdraw amount");
	    }
	   }
	  }
	  catch(Exception e) {
	   System.out.println(e);
	  }
}

private static void deposite() {
	// TODO Auto-generated method stub
	  System.out.println("Enter the account number to deposit");
	  int a=sc.nextInt();
	  try {
	   Connection con = MyConnection.getConnection();
	   String qry = "select * from bankaccount where acno=?";
	   PreparedStatement pstmt = con.prepareStatement(qry);
	   pstmt.setInt(1, a);
	   ResultSet rs = pstmt.executeQuery();
	   if(rs.next()) {
	    System.out.println("Enter the amount to deposit ");
	    float x = sc.nextFloat();
	    float b = rs.getFloat(4);
	    b=b+x;
	    String q = "update bankaccount set balance=? where acno=?";
	    PreparedStatement pstmt2 = con.prepareStatement(q);
	    pstmt2.setFloat(1, b);
	    pstmt2.setInt(2,a);
	    pstmt2.executeUpdate();
	    System.out.println("Your Deposit transaction is successfull.");
	    System.out.println("Your new balance amount : " + b);
	   }
	  }
	  catch(Exception e) {
	   System.out.println(e);
	  }
}

private static void showAllAccounts() {

	
	 try {
	        Connection con = MyConnection.getConnection();
	        String qry = "select * from bankaccount";
	        PreparedStatement pstmt = con.prepareStatement(qry);
	        ResultSet rs = pstmt.executeQuery();
//	        ArrayList<BankAccount> accountlist = new ArrayList<>();
	        while (rs.next()) {
	            int a = rs.getInt(1);
	            String n = rs.getString(2);
	            String d = rs.getString(3);
	            float b = rs.getFloat(4);
	            String p = rs.getString(5);
	            BankAccount b1 = new BankAccount(a, n, d, b, p);
//	            accountlist.add(b1);
	            System.out.println(b1);
	        }
	        
	       // System.out.println("========== All Bank Accounts ==========");
//	     
	       // for (BankAccount b : accountlist) {
//	            System.out.println(b); // uses toString()
//	        }
	    } catch (Exception e) {
	        System.out.println("Error: " + e);
	    } 
 }

 private static void addAccount() {
  try {
  sc.nextLine();
  System.out.println("Enter Name");
  String n = sc.nextLine();
  System.out.println("Enter the address");
  String a = sc.nextLine();
  System.out.println("Enter the balance ");
  float b= sc.nextFloat();
  System.out.println("Enter the phone");
  String p = sc.next();
  Connection con =MyConnection.getConnection();
  String qry = "insert into bankaccount(acname,address,balance,phone) values(?,?,?,?)";
  PreparedStatement pstmt = con.prepareStatement(qry);
  
  pstmt.setString(1,n);
  pstmt.setString(2,a);
  pstmt.setFloat(3, b);
  pstmt.setString(4,p);
  
  pstmt.executeUpdate();
  System.out.println("Your New Bank Account is created.");
//  con.close();
  }
  catch(Exception e) {
   System.out.println(e);
  }
 }

 private static void createTable() {
  try {
   Connection con = MyConnection.getConnection();
   Statement stmt = con.createStatement();
   stmt.executeUpdate("create table if not exists bankaccount(acno int primary key auto_increment,acname varchar(30),address varchar(30),balance float,phone varchar(10))");
  }
  catch(Exception e) {
   System.out.println(e);
  }
 }
}