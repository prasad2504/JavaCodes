
public class BankTransactionDemo {

	public static void main(String[] args) {
		BankAccount banckaccount = new BankAccount(2504 ,"prasad" ,"aabc" ,10000);
		Transaction t1 = new Transaction (banckaccount , "deposite" , 5000);
		Transaction t2 = new Transaction (banckaccount , "withdraw" , 2500);
		t1.start();
		t2.start();

	}
	
}
