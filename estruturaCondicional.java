package exemplo6;

import java.util.Scanner;

public class estruturaCondicional {

	public static void main(String[] args) {
		
		int x = 18;
		
		System.out.println("Digite a sua idade: ");
		Scanner sc = new Scanner (System.in);
		
		x = sc.nextInt();
		
		if (x < 18) {
			System.out.println("Você ainda é menor de idade");
		} else {
			System.out.println("Você é maior de idade");
		}
	
		sc.close();
	}

}
