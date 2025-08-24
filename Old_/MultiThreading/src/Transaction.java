
public class Transaction extends Thread{

	BankAccount bankaccount;
	String transactiontype;
	double amount;
	

	public Transaction(BankAccount bankaccount, String transactiontype, double amount) {
		
		this.bankaccount = bankaccount;
		this.transactiontype = transactiontype;
		this.amount = amount;
	}

	
	public void run() {
		if(transactiontype.equals("deposite")) {
			bankaccount.deposite(amount);
		}
		else if(transactiontype.equals("withdraw")) {
			bankaccount.withdraw(amount);
		}
		else if (transactiontype.equals("checkbalance")) {
			System.out.println("your balance is  : " +bankaccount.getBalance());
		}
	}
}
