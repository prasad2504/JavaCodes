import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class DateTimeApiDemo {

	public static void main(String[] args) {
		
		//first feature of java 8
		LocalDate today = LocalDate.now();
		
		System.out.println(today.getYear());
		System.out.println(today.plusDays(4));
		System.out.println(today.plusDays(-4));
		System.out.println(today.getDayOfYear());
		System.out.println(today.getDayOfMonth());
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		//String formatter = today.formatter(formatter);
		
		
		
	}
}
