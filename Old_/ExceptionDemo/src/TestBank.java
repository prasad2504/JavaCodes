
public class TestBank {

	public static void main(String[] args) {
		BankAccount bankac = new BankAccount(985642,"BOM","prasad",8000);
		bankac.deposit(1000);
		bankac.showdetails();
	//	try {
		bankac.withdraw(15000);
	//	}
	//	catch(InvalidBalanceException e){
	//		System.out.println(e);
	//	}
		bankac.showdetails();
		
		
		
				
	}
}
