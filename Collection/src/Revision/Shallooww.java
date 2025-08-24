package Revision;

public class Shallooww {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		//Books book1 = new Books(1,"Agnipankh");
		//Books book2 = (Books) book1.Clone();
		
		
//		System.out.println("book1 id:"+book1.id);
//		System.out.println("book1 name:"+book1.bname);
//		
//		System.out.println("book2 id:"+book2.id);
//		System.out.println("book2 name:"+book2.bname);
//		
//		System.out.println("----------------------------------");
//		
//		book2.bname="shrimantyogi";
//		
//		System.out.println("book1 id:"+book1.id);
//		System.out.println("book1 name:"+book1.bname);
//		
//		System.out.println("book2 id:"+book2.id);
//		System.out.println("book2 name:"+book2.bname);
		
		
		
		
		/*this is called shallow copy coz we only assign the book2.bname and book1.bname remains same it does not change 
		shallow copy comes to overcome the problem of reference copy.
		but in shallow copy also when we provide a custom inner class for any anotheer feild then the shallow copy fails it overide the same value
		*/
		
		
		
		
		
	}

}

//class Books implements Cloneable{
//	int id;
//	String bname;
//	
//	public Books(int id,String bname) {
//		this.id=id;
//		this.bname=bname;
//	}
//	
//	public Object Clone () throws CloneNotSupportedException {
//		return super.clone();
//	}
//}
