package br.com.generation.vetor;

import java.util.Scanner;

public class Exercicio01Vetor {
	
 // 1 - Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
// 		atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
	
	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			int[] pontuacoes = new int[5];
			int maiorPont = 0;
			int i;
			
			System.out.println(" Digite aqui 5 valores de pontua��es: ");
			for(i = 0; i < pontuacoes.length; i++) {
				System.out.println((i + 1)+ "� Potua��o: ");
				pontuacoes[i] = leia.nextInt();
				
				if (pontuacoes[i] > maiorPont) {
					maiorPont = pontuacoes[i];
				}
				
			}
			System.out.println("A maior pontua��o �: " + maiorPont);
			
			leia.close();
		}
	}

}
