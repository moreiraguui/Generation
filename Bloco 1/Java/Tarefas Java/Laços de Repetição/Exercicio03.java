package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio3 {

	/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
	 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. */
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade = 0, num1 = 0, num2 = 0;
		
		while (idade < 99) { // Aqui há uma função onde o programa funcionara enquanto a idade do usuario for menor que 99.
			System.out.println("Digite aqui a sua idade: ");
			idade = leia.nextInt();
		
			if (idade <= 21) {
				num1++; // Aqui há um contador junto com uma condição, onde quando inserido qualquer valor menor ou igual a 21 ele armazena
			}
			
			if (idade >= 50 && idade < 99) {
				num2++; // Aqui há um contador junto com uma condição, onde quando inserido qualquer valor maior ou igual a 50 ele armazena.
			}
			
		}
		
		System.out.println("O total de pessoas com menos de 21 anos é: " + num1 + " \nO total de pessoas com mais de 50 anos é: " + num2);
		// Neste print, há a contagem do total de pessoas com menos de 21 anos e o total de pessoas com mais de 50 anos
		
		leia.close();
	}
	
}
