package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio5 {
	
	/* 5 - Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros
digitados. */

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num = 0, soma = 0;
				
		do {
			System.out.println("Digite um n�mero qualquer: ");
			num = leia.nextInt();
			soma += num;
		}
		
		while (num != 0);
		System.out.println("A soma dos n�meros � de: " + soma);
	
		leia.close();
		
	}	

}
