package br.com.generation.aula02;

import java.util.Scanner;

public class Exercicio1 {

	// 1 - Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite aqui tr�s n�mero: ");
		num1 = leia.nextInt();
		num2 = leia.nextInt();
		num3 = leia.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("\nO primeiro n�mero que � " + num1 + " � o maior n�emro.");
		}
		
		if (num2 > num1 && num2 > num3) {
			System.out.println("\nO segundo n�mero que � " + num2 + " � o maior n�emro.");
		}
		
		if (num3 > num1 && num3 > num2) {
			System.out.println("\nO terceiro n�mero que � " + num3 + " � o maior n�emro.");
		}
	
		
		leia.close();
		
		}
	}


