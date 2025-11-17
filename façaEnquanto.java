package exemplo6;

import java.util.Scanner;

public class façaEnquanto {

	public static void main(String[] args) {
		
		char resp;
		Scanner sc = new Scanner(System.in);
		
	do {	
		System.out.println("Digite a temperatura em Celcius: ");
		double c = sc.nextDouble(); 
		double f = 9.0 * c /5.0 + 32.0 ;
		System.out.printf("Equivalente em Fahrenheit: %.1f%n ", f);
		System.out.print("Deseja repetir (s/n)? ");
		resp = sc.next().charAt(0);
		}while(resp != 'n');
	
	System.out.print("Programa encerrado");
	
	sc.close();
	}

}
