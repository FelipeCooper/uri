package uri_judge;

import java.util.Scanner;

public class Uri1009 {
	public static void uri1009() {
		Scanner sc = new Scanner(System.in);
 		String name = sc.nextLine();
		double salary = sc.nextDouble();
		double sales = sc.nextDouble();
		
		salary += sales * 0.15;
		System.out.printf("TOTAL = R$ %.2f\n", salary);
		sc.close();	
	}
}
