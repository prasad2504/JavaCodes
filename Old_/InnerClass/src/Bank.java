//static innner class example

public class Bank {

	int bid;
	String name;
	static String address;
	
	
	 public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
		public Bank() {
		super();
	}

		public Bank(int bid, String name, String address) {
			super();
			this.bid = bid;
			this.name = name;
			this.address = address;
		}

		@Override
		public String toString() {
			return "Bank [bid=" + bid + ", name=" + name + ", address=" + address + "]";
		}
		







		static class DemandDraft{
		 int dno;
		 String bankname;
		 float amt;
		public int getDno() {
			return dno;
		}
		public void setDno(int dno) {
			this.dno = dno;
		}
		public String getBankname() {
			return bankname;
		}
		public void setBankname(String bankname) {
			this.bankname = bankname;
		}
		public float getAmt() {
			return amt;
		}
		public void setAmt(float amt) {
			this.amt = amt;
		}
		public DemandDraft() {
			super();
		}
		public DemandDraft(int dno, String bankname, float amt) {
			super();
			this.dno = dno;
			this.bankname = bankname;
			this.amt = amt;
		}
		@Override
		public String toString() {
			return "DemandDraft [dno=" + dno + ", bankname=" + bankname + ", amt=" + amt + "]";
		}
		 
		 
	}
	
}
