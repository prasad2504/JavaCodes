
public class Book {
	
	int bookid;
	String title;
	String author;
	int price;
	
	public void setBookid(int b) {
		bookid=b;
	}
	public int getBookid() {
		return bookid;
	}
	
	public void setTitle(String s) {
		title = s;
	}
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String n) {
		title = n;
	}
	public String getAuthor() {
		return title;
	}
	
	public void setPrice(int p) {
		price = p;
	}
	public int getPrice() {
		return price;
	}
	
	public void printData() {
		System.out.println("Book_id : " + bookid);
		System.out.println("Title :" + title);
		System.out.println("Author :" + author);
		System.out.println("Price :" +price);
	}

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setBookid(1);
		b1.setTitle("Shyam chi aai");
		b1.setAuthor("Sane Guruji");
		b1.setPrice(250);
		b1.printData();
		
	
		Book b2 = new Book();
		b2.setBookid(2);
		b2.setTitle("Agnipankh");
		b2.setAuthor("Dr.A.P.J abdul kalam");
		b2.setPrice(500);
		b2.printData();
		
		

	}

}
