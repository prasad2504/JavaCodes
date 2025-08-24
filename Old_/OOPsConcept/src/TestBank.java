public class TestBank {
 public static void main(String[] args) {
  Bank b1=new Bank();
  b1.setAcno(1234);
  b1.setAcname("Megha");
  b1.setAddress("Pune");
  b1.setEmail("megha@gmail.com");
  b1.setPhone("9887767675");
  b1.setBalance(1000);
  
  Bank b2 = new Bank(1054,"Usha","Mumbai","usha@gmail.com","98989898989",5000);
  
  Transaction t1=new Transaction();
  t1.setBank(b1);
  t1.deposit(500);
  t1.showBalance();
  
  Transaction t2 = new Transaction();
  t2.setBank(b2);
  t2.withdraw(2000);
  t2.showBalance();
  
 }
}