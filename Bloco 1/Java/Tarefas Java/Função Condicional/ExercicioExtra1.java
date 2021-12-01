package br.com.generation.aula02;

import java.util.Scanner;

public class Exercicio1 {

	// 1 - Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite aqui três número: ");
		num1 = leia.nextInt();
		num2 = leia.nextInt();
		num3 = leia.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("\nO primeiro número que é " + num1 + " é o maior núemro.");
		}
		
		if (num2 > num1 && num2 > num3) {
			System.out.println("\nO segundo número que é " + num2 + " é o maior núemro.");
		}
		
		if (num3 > num1 && num3 > num2) {
			System.out.println("\nO terceiro número que é " + num3 + " é o maior núemro.");
		}
	
		
		leia.close();
		
		}
	}


