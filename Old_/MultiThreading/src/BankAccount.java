
public class BankAccount {

	int acno;
	String name1;
	String name2;
	double balance;
	
	//all getter setter methods
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//default constructor
	public BankAccount() {
		super();
	}
	
	//parameterised constructor
	public BankAccount(int acno, String name1, String name2, double balance) {
		super();
		this.acno = acno;
		this.name1 = name1;
		this.name2 = name2;
		this.balance = balance;
	}
	
	//tostring method
	@Override
	public String toString() {
		return "BankAccount [acno=" + acno + ", name1=" + name1 + ", name2=" + name2 + ", balance=" + balance + "]";
	}
	
	
	public synchronized  void deposite(double amt) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("before deposting balance : " +getBalance()) ;
		balance = balance + amt;
		System.out.println("after deposite balance : " +getBalance());
	}
	
	public synchronized void withdraw(double amt) {
		if (balance > amt) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("before withdraw balance : " +getBalance()) ;
			balance = balance - amt;
			System.out.println("after withdraw balance : " +getBalance()) ;
		}else {
			System.out.println("wrong amt");
		}
	}
	
	
	
}
