
public class BankAccount {

	int acno;
	String acname;
	String address;
	float balance;
	String phone;
	
	
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getName() {
		return acname;
	}
	public void setName(String name) {
		this.acname = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public BankAccount() {
		super();
	}
	public BankAccount(int acno, String name, String address, float balance, String phone) {
		super();
		this.acno = acno;
		this.acname = name;
		this.address = address;
		this.balance = balance;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "BankAccount [acno=" + acno + ", name=" + acname + ", address=" + address + ", balance=" + balance
				+ ", phone=" + phone + "]";
	}
	
	
	
	
	
}
