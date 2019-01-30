package uri_judge;

import java.util.Scanner;

public class Uri1011 {
	public static void uri1011() {
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double volume =  ((4.0/3)*(3.14159)* Math.pow(raio, 3));
		System.out.printf("VOLUME = %.3f%n",volume);
		sc.close();
	}
}
