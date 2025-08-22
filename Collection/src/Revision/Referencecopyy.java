package Revision;

public class Referencecopyy {
	
	public static void main(String[] args) {
		
		Book book1 = new Book(1,"Agnipankh");
		Book book2 = book1;
		
		
		System.out.println("book1 id:"+book1.id);
		System.out.println("book1 name:"+book1.bname);
		
		System.out.println("book2 id:"+book2.id);
		System.out.println("book2 name:"+book2.bname);
		
		System.out.println("----------------------------------");
		
		book2.bname="shrimantyogi";
		
		System.out.println("book1 id:"+book1.id);
		System.out.println("book1 name:"+book1.bname);
		
		System.out.println("book2 id:"+book2.id);
		System.out.println("book2 name:"+book2.bname);
		
		//this is called reference copy coz we only assign the book2.bname but its also chages book1.bname.
		
		
		
		
		
		
	}

}

class Book{
	int id;
	String bname;
	
	public Book(int id,String bname) {
		this.id=id;
		this.bname=bname;
	}
}
