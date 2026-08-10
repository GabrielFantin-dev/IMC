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
		
		System.out.println("O seu peso é " + IMC);
	}
		
}
