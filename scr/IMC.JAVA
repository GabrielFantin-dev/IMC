package IMC;

import java.util.Scanner;

public class Imc {
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a sua altura?");
		double altura = entrada.nextDouble();
		
		System.out.println("Qual o seu peso?");
		int peso = entrada.nextInt();
		
		double IMC = peso / (altura * altura);
		
		if (IMC >= 18) {
			System.out.println("Você esta com a massa correta.");
		}else {
			System.out.println("Voce esta com a massa muito baix, va comer!");
		}
		
		System.out.println("O seu IMC é " + IMC);
	}
		
}
