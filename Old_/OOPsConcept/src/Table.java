import java.util.Scanner;

public class Table {
	
	public void showtable(int no) {
		for(int i=1;i<=10;i++) {
			System.out.println(no*i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number :");
		int no = sc.nextInt();

		Table a = new Table();
		a.showtable(no);
	}

}
