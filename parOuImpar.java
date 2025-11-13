package exemplo6;

import java.util.Scanner;

public class parOuImpar {

	public static void main(String[] args) {
		
		int x;
		
		System.out.println("Digite um número inteiro: ");
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt(); 
		
		if (x % 2 == 0) {
			System.out.println("O número que você digitou é Par");
		}else {
			System.out.println("O número que você digitou é Ímpar");
		}
		
		
		sc.close();
	}

}
