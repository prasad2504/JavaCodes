public class Bank {
	
 private int acno;
 private String acname;
 private String address;
 private String phone;
 private String email;
 private double balance;
 
 
 public int getAcno() {
  return acno;
 }
 public void setAcno(int acno) {
  this.acno = acno;
 }
 public String getAcname() {
  return acname;
 }
 public void setAcname(String acname) {
  this.acname = acname;
 }
 public String getAddress() {
  return address;
 }
 public void setAddress(String address) {
  this.address = address;
 }
 public String getPhone() {
  return phone;
 }
 public void setPhone(String phone) {
  this.phone = phone;
 }
 public String getEmail() {
  return email;
 }
 public void setEmail(String email) {
  this.email = email;
 }
 public double getBalance() {
  return balance;
 }
 public void setBalance(double balance) {
  this.balance = balance;
 }
 
 public Bank(int acno, String acname, String address, String phone, String email, double balance) {
  super();
  this.acno = acno;
  this.acname = acname;
  this.address = address;
  this.phone = phone;
  this.email = email;
  this.balance = balance;
 }
 
 public Bank() {
  super();
 }
 
 @Override
 public String toString() {
  return "Bank [acno=" + acno + ", acname=" + acname + ", address=" + address + ", phone=" + phone + ", email="
    + email + ", balance=" + balance + "]";
 }
}