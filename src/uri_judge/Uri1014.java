package uri_judge;

import java.util.Scanner;

public class Uri1014 {
	public static void uri1014() {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		float y = sc.nextFloat();
		double consumo = x/y;
		System.out.printf("%.3f km/l%n",consumo);
		
		
		sc.close();
	}

}
