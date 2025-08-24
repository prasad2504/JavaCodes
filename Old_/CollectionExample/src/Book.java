
public class Book {
	
	private int Bookid;
	private String Bookname;
	private String Bookauthor;
	private double Bookprice;
	private String Description;
	
	public int getBookid() {
		return Bookid;
	}
	public void setBookid(int bookid) {
		Bookid = bookid;
	}
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	public String getBookauthor() {
		return Bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		Bookauthor = bookauthor;
	}
	public double getBookprice() {
		return Bookprice;
	}
	public void setBookprice(double bookprice) {
		Bookprice = bookprice;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	
	public Book() {
		super();
	}
	public Book(int bookid, String bookname, String bookauthor, double bookprice, String description) {
		super();
		Bookid = bookid;
		Bookname = bookname;
		Bookauthor = bookauthor;
		Bookprice = bookprice;
		Description = description;
	}
	@Override
	public String toString() {
		return "Book [Bookid=" + Bookid + ", Bookname=" + Bookname + ", Bookauthor=" + Bookauthor + ", Bookprice="
				+ Bookprice + ", Description=" + Description + "]";
	}
	
	
	
	

}
