

//Esse é um clássico exercício de introdução à programação em Java — 
//ótimo para treinar entrada de dados, operações matemáticas e saída formatada.


package exemplo5;

import java.util.Scanner;

public class delta {

	public static void main(String[] args) {
		
		double a, b, c, delta, B1, B2;
		
		
		System.out.println("Digite o valor de a, b, c, respectivamente: ");
		Scanner sc = new Scanner (System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta =  Math.pow(b,2)-4*a*c;
			if (delta < 0) {
				
				System.out.println("Não existe raízes reais ");
				
			}else {
		System.out.println("O Valor de Delta é: " + delta);
		
		B1 =  (-b + (Math.sqrt(delta))/ 2*a );
		
		B2 =  (-b - (Math.sqrt(delta))/ 2*a );
		
		System.out.println("e essas são as raizes possíveis: ");
		
		System.out.println("x1"+B1);
		System.out.println("x2"+B2);
		}
		
		sc.close();

	}

}
