import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
	
	static Scanner sc;
	static ArrayList<Book> booklist;
	
	private static void addBook() {
		int bid;
		double bp;
		String ba,d,bn;
		
		System.out.println("Enter the Book id ");
		  bid=sc.nextInt();
		  
		  sc.nextLine();
		  
		  System.out.println("Enter the Book name ");
		  bn=sc.nextLine();
		  
		  
		  System.out.println("Enter the Book Author:");
		  ba = sc.nextLine();
		 
		 
		  System.out.println("Enter the Book Price:");
		  bp = sc.nextInt();
		  
		  sc.nextLine();

		  System.out.println("Enter the Book Des:");
		  d = sc.nextLine();
		 
		
		 Book b1 = new Book(bid,bn,ba,bp,d);
		 booklist.add(b1);
	}

	public static void main(String[] args) {
		
		int opt =0;
		booklist = new ArrayList();
	    sc = new Scanner(System.in);
	    
	    do {
	    	   System.out.println("1. Add a new Book ");
	    	   System.out.println("2. Show all Books ");
	    	   System.out.println("3. Delete any Book ");
	    	   System.out.println("4. Update Book Description ");
	    	   System.out.println("5. Exit ");
	    	   System.out.println("Enter your option ");
	    	   
	    	   opt=sc.nextInt();
	    	   
	    	   switch(opt) {
	    	   case 1:addBook();
	    	     break;
	    	   case 2:showBooks();
	    	     break;
	    	   case 3: deleteBook();
	    	     break;
	    	   case 4: updateBook();
	    	     break;
	    	   }
	    }while(opt!=5);

		
		
	}

	private static void updateBook() {
		 System.out.println("Enter the Bookid to update ");
		  int bid = sc.nextInt();
		  
		  sc.nextLine();
		  
		 int bp;
		  String bn,ba,d;
		  for(Book b : booklist) {
		   if(b.getBookid() == bid) {
		
		    System.out.println("Enter the Book updated name ");
		    b.setBookname(sc.nextLine());
		    
		    System.out.println("Enter the Book updated author");
		    b.setBookauthor(sc.nextLine());
		   
		         
		          
		          System.out.println("Enter the Book updated Price:");
		          bp = sc.nextInt();
		          b.setBookprice(bp);
		          
		          System.out.println("Enter the Description to change Book description:");		          
		          b.setDescription(sc.nextLine());
		          System.out.println("The Book All Inserted data is updated");
		   }
		  }
		
	}

	private static void deleteBook() {
		
		 System.out.println("Enter the Book id to delete ");
		  int bid = sc.nextInt();
		  
		 for(Book b :booklist) {
			   if(b.getBookid() == bid) {
			    booklist.remove(b);
			    System.out.println("The student is deleted");
			    break;
			   }
		 }
		
	}

	private static void showBooks() {
		for(Book b1 :booklist) {
			   System.out.println(b1);
			  }
		
	}

	
}
