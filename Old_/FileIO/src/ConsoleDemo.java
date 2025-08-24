import java.io.Console;

public class ConsoleDemo {
	
	public static void main(String[] args) {
		Console c1 = System.console();
		String un , ps;
		
		System.out.println("enter the username :");
		un=c1.readLine();
		
		System.out.println("enter the password :");
		ps=new String(c1.readPassword());
		
		if(un.equals("student") && ps.equals("student123")) {
			System.out.println("Welcome to login page.....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new StudentApp();
			
		}else {
			System.out.println("You enter a wrong password");
		}
	}

}
