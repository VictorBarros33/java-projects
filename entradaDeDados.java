package exemplo4;

import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String x;
		x = sc.next();
		System.out.print("Você digitou: " + x);
		
		sc.close();

	}

}
