package uri_judge;

import java.util.Scanner;

public class Uri1010 {
	public static void uri1010() {
		Scanner sc = new Scanner(System.in);
		int piece1 = sc.nextInt();
		int amount1 = sc.nextInt();
		double priceTotal = sc.nextDouble() * amount1;
		int piece2 = sc.nextInt();
		int amount2 = sc.nextInt();
		priceTotal += sc.nextDouble() *amount2; 
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", priceTotal);
		
	}
}
