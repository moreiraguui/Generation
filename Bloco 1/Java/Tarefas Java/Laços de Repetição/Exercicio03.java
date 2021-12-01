package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio3 {

	/* Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
	 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. */
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade = 0, num1 = 0, num2 = 0;
		
		while (idade < 99) { // Aqui h� uma fun��o onde o programa funcionara enquanto a idade do usuario for menor que 99.
			System.out.println("Digite aqui a sua idade: ");
			idade = leia.nextInt();
		
			if (idade <= 21) {
				num1++; // Aqui h� um contador junto com uma condi��o, onde quando inserido qualquer valor menor ou igual a 21 ele armazena
			}
			
			if (idade >= 50 && idade < 99) {
				num2++; // Aqui h� um contador junto com uma condi��o, onde quando inserido qualquer valor maior ou igual a 50 ele armazena.
			}
			
		}
		
		System.out.println("O total de pessoas com menos de 21 anos �: " + num1 + " \nO total de pessoas com mais de 50 anos �: " + num2);
		// Neste print, h� a contagem do total de pessoas com menos de 21 anos e o total de pessoas com mais de 50 anos
		
		leia.close();
	}
	
}
