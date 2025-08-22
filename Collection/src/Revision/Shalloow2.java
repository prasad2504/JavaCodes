//package Revision;
//
//public class Shalloow2 {
//	
//	public static void main(String[] args) throws CloneNotSupportedException {
//		
//		Author author = new Author("prasad");
//		
//		Books book1 = new Books(1,"Agnipankh",author);
//		Books book2 = (Books) book1.Clone();
//		
//		
//		System.out.println("book1 id:"+book1.id);
//		System.out.println("book1 name:"+book1.bname);
//		System.out.println("book1 au.name :" +book1.author.authorname);
//		
//		System.out.println("book2 id:"+book2.id);
//		System.out.println("book2 name:"+book2.bname);
//		System.out.println("book2 au.name :" +book2.author.authorname);
//
//		
//		System.out.println("----------------------------------");
//		
//		book2.bname="shrimantyogi";
//		book2.author.authorname="riyuuu";
//		
//		System.out.println("book1 id:"+book1.id);
//		System.out.println("book1 name:"+book1.bname);
//		System.out.println("book1 au.name :" +book1.author.authorname);
//
//		
//		System.out.println("book2 id:"+book2.id);
//		System.out.println("book2 name:"+book2.bname);
//		System.out.println("book2 au.name :" +book2.author.authorname);
//
//		
//	
//		
//		
//		
//	}
//
//}
//
//class Books implements Cloneable{
//	int id;
//	String bname;
//	Author author;
//	
//	public Books(int id,String bname,Author author) {
//		this.id=id;
//		this.bname=bname;
//		this.author = author;
//	}
//	
//	public Object Clone () throws CloneNotSupportedException {
//		return super.clone();
//	}
//}
//
//class Author {
//	
//	String authorname;
//	
//	public Author(String authorname) {
//		
//		this.authorname=authorname;
//		
//	}
//}
