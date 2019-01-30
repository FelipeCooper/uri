package uri_judge;

import java.util.Scanner;

public class Uri1013 {
	public static void uri1013() {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int MaiorAB = ((a+b+ Math.abs(a-b))/2);
		int MaiorABC = ((c+MaiorAB + Math.abs(MaiorAB-c))/2);
		System.out.print(MaiorABC);
		System.out.println(" eh o maior");
		sc.close();
	}
}
