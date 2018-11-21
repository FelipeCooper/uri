package uri_judge;

import java.util.Scanner;

public class Uri1007 {
	public static void uri1007() {
		int A,B,C,D;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		System.out.println("DIFERENCA = "+(A*B - C*D));
		sc.close();
	}
}
