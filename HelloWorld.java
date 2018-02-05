import java.util.Date;
import java.text.*;

public class HelloWorld {

	public static void main(String[] args) {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); 

		System.out.println("hi Alice");

		System.out.println("hi Bob");
		
		System.out.println("hi Charlie");

		System.out.println("hi Denise");

	}
}
