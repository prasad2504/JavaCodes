import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Tbank{
	
	public static void main(String[] args) {
		int opt=0;
		
		Scanner sc = new Scanner(System.in);
		BankAcount b1 = null;
		
		ArrayList<BankAcount> banklist = new ArrayList<BankAcount>();
		do {
			System.out.println("1:Add new Bank Account");
			System.out.println("2: Deposite amt");
			System.out.println("3: Withdraw amt");
			System.out.println("4: show balance");
			System.out.println("5: show details");
			System.out.println("6:exit");
			
			System.out.println("enter your option :");
			opt=sc.nextInt();
			
			switch(opt) {
			case 1: 
				System.out.println("enter acno ,name , address , balance");
				int a;
				String n,d;
				float b;
				a=sc.nextInt();
				n=sc.next();
				d=sc.next();
				b=sc.nextFloat();
			    b1 = new BankAcount(a, n, d, b);
			    banklist.add(b1);
			    break;
			    
			case 2:
				
				
				System.out.println("enter acno to deposite");
				a=sc.nextInt();
				boolean flag=false;
				Iterator<BankAcount> i1 = banklist.iterator();
				while(i1.hasNext()) {
					b1=i1.next();
					if(b1.acno==a) {
						System.out.println("Enter amount to deposit");
						b=sc.nextFloat();
						b1.deposite(b);
						flag=true;
						break;
					}
				}
				
				if(flag==false) {
						System.out.println("Wrong Ac No.");
				}		
				
				break;
				
			case 3:
				System.out.println("enter acc no to withdraw from which acc");
				a=sc.nextInt();
				boolean  flag1 =false;
				Iterator<BankAcount> i2 = banklist.iterator();
				while(i2.hasNext()) {
					b1=i2.next();
				
				if(b1.acno==a) {
					System.out.println("enter the amt to withdraw ");
					b=sc.nextFloat();
					if(b1.balance>b) {
						b1.withdraw(b);
					}else {
						System.out.println("you cannot withdraw insufficient balance ");
					}
					
					flag1= true;
					break;
					
					
				}
			}
				
				if(flag1==false) {
					System.out.println("Wrong Ac No.");
			}
	   break;
			    
			case 4:
				System.out.println("enter ac no to show its balance.");
				a=sc.nextInt();
				boolean flag2 = false;
				
				Iterator <BankAcount> i3 = banklist.iterator();
				while(i3.hasNext()) {
					b1=i3.next();
					
					if(b1.acno==a) {
						System.out.println("your balance is :" +b1.showBalance());
						flag2= true;
						break;
					}
				}
				if(flag2 == false) {
					System.out.println("Wrong Ac No.");
				}
								
				break;
				
			case 5:
				System.out.println("enter ac no to show all details");
				a=sc.nextInt();
				boolean flag3 = false;
				Iterator <BankAcount> i4=banklist.iterator();
				while(i4.hasNext()) {
					b1=i4.next();
					
					if(b1.acno==a) {
						b1.showdetails();
						flag3 = true;
						break;
						
					}
					
				}
				
				if(flag3 == false) {
					System.out.println("wrong ac no entered");
				}
				
				
		
			}

			
		}while(opt!=6);
		
		
	}
}