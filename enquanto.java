package exemplo6;

import java.util.Scanner;

public class enquanto {

	public static void main(String[] args) {

		System.out.println("Digite o um número diferente de 0 para continuar");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		while (x != 0) {
			x = sc.nextInt();
		}
		System.out.println("Programa finalizado");

		sc.close();

	}

}
