package Imc;

import java.util.Scanner;

public class Imc {
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a sua altura?");
		double altura = entrada.nextDouble();
		
		System.out.println("Qual o seu peso?");
		int peso = entrada.nextInt();
		
		double IMC = peso / (altura * altura);
		
		if (IMC < 18.5) {
			System.out.println("Você está com magreza ou abaixo do peso.");
		}else if(IMC <= 24.9) {
			System.out.println("Você está com peso normal ou adequado!");
		}else if(IMC >= 25.0 && IMC <= 29.9) {
			System.out.println("Você está com sobrepeso.");
		}else if(IMC >= 30.0 && IMC <= 39.9) {
			System.out.println("Você está com obesidade.");
		}else {
			System.out.println("Você está com obesidade grave.");
		}

		System.out.println("O seu IMC é " + IMC);
	}
		
} //Fim.