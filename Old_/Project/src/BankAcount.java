public class BankAcount{
	
	int acno;
	String name;
	String add;
	float balance;
	
	
	public BankAcount(int acno, String name, String add, float balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.add = add;
		this.balance = balance;
	}
	
	

	@Override
	public String toString() {
		return "BankAcount [acno=" + acno + ", name=" + name + ", add=" + add + ", balance=" + balance + "]";
	}



	public float showBalance() {
		
		return balance;
	}
	
	
	public void deposite(float amt) {
		balance = balance + amt;
	}
	
	public void withdraw(float amt) {
		balance = balance -amt;
		
	}
	
	public void showdetails() {
		System.out.println(acno+name+add+balance);
	}
}