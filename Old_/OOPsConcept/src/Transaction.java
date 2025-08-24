public class Transaction {
 Bank bank;

 public Bank getBank() {
  return bank;
 }

 public void setBank(Bank bank) {
  this.bank = bank;
 }
 
 public void deposit(double amt) {
  double b=bank.getBalance();
  bank.setBalance(amt+b);
 }
 public void withdraw(double amt) {
  double b= bank.getBalance();
  if(amt>b) {
   System.out.println("Insufficient balance");
  }
  else {
   bank.setBalance(b-amt);
  }
 }
 public void showBalance() {
  System.out.println("Your balance is : " + bank.getBalance());
 }
 
}