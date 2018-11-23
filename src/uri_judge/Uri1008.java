package uri_judge;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void uri1008() {
		Locale.setDefault(Locale.US);
		int number,hoursWorked;
		float salaryForHour;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		hoursWorked = sc.nextInt();
		salaryForHour = sc.nextFloat();
		System.out.printf("NUMBER = %d%n",number);
		System.out.printf("SALARY = U$ %.2f%n",(hoursWorked*salaryForHour));
		sc.close();
	}
}
