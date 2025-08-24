//nextes class example


public class Mobile {
	
	int mid;
	String company;
	double price;
	
	
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public Mobile() {
		super();
	}
	
	public Mobile(int mid, String company, double price) {
		super();
		this.mid = mid;
		this.company = company;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Mobile [mid=" + mid + ", company=" + company + ", price=" + price + "]";
	}
	
	
	class Sim {
		
		int simid;
		String company;
		String type;
		
		
		public int getSimid() {
			return simid;
		}
		public void setSimid(int simid) {
			this.simid = simid;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
		
		public Sim() {
			super();
		}
		
		
		public Sim(int simid, String company, String type) {
			super();
			this.simid = simid;
			this.company = company;
			this.type = type;
		}
		
		
		@Override
		public String toString() {
			return "Mobile [mid=" + mid + ", company=" + company + ", price=" + price + " Sim [simid=" + simid + ", company=" + company + ", type=" + type + "]";
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
