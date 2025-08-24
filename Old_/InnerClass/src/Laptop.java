
//local inner class example


public class Laptop {
	
	int id;
	String company;
	float prince;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public float getPrince() {
		return prince;
	}
	public void setPrince(float prince) {
		this.prince = prince;
	}
	public Laptop() {
		super();
	}
	public Laptop(int id, String company, float prince) {
		super();
		this.id = id;
		this.company = company;
		this.prince = prince;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", company=" + company + ", prince=" + prince + "]";
	}
	
	public void charge() {
		class Charger {
			String company;
			String capacity;
			
			
			public Charger(String company, String capacity) {
				super();
				this.company = company;
				this.capacity = capacity;
			}


			@Override
			public String toString() {
				return "Charger [company=" + company + ", capacity=" + capacity + "]";
			}
			
			
			
			
			
			
		}
		Charger c1 = new Charger("dell" , "8hr");
		System.out.println(c1);
	}
	
	

}
