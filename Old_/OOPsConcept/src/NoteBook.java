
public class NoteBook {
		int pages;
		String brand;
		float price;
		String size;
		
		
		public int getPages() {
			return pages;
		}
		public void setPages(int pages) {
			this.pages = pages;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		public NoteBook(int pages, String brand, float price, String size) {
			super();
			this.pages = pages;
			this.brand = brand;
			this.price = price;
			this.size = size;
		}
		
		public NoteBook() {
			
		}
		
		public String toString() {
			return "Company : " + this.brand    
				+ "price : " + this.price 
				+ "pages : " + this.pages 
				+ "size : " + this.size;
		}
		
		
		
		
}
