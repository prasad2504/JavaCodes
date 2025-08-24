
public class BankAccount {
	
	int acno;
	String bankname;
	String bankholdername;
	double balance=0;
	
	
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBankholdername() {
		return bankholdername;
	}
	public void setBankholdername(String bankholdername) {
		this.bankholdername = bankholdername;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public BankAccount() {
		super();
	}
	
	
	public BankAccount(int acno, String bankname, String bankholdername, double balance) {
		super();
		this.acno = acno;
		this.bankname = bankname;
		this.bankholdername = bankholdername;
		this.balance = balance;
	}
	
	
	@Override
	public String toString() {
		return "BankAccount [acno=" + acno + ", bankname=" + bankname + ", bankholdername=" + bankholdername
				+ ", balance=" + balance + "]";
	}
	
	
	public void deposit(double amt) {
		balance = balance +amt;
	}
	
	public void withdraw(double amt) {
		try{if(amt<balance) {
			balance = balance-amt;
		}else {
			throw new InvalidBalanceException("Invalid...!");//called parameterised constructor
		}
		}catch(InvalidBalanceException w) {
			System.out.println(w);
			
		}
		
	}
	
	public void showdetails() {
		System.out.println("ac no :" + acno);
		System.out.println("bank name" + bankname);
		System.out.println("holder name :" + bankholdername);
		
	}
}

