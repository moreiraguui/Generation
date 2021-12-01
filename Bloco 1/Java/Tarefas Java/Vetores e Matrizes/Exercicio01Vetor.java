package br.com.generation.vetor;

import java.util.Scanner;

public class Exercicio01Vetor {
	
 // 1 - Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
// 		atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	
	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			int[] pontuacoes = new int[5];
			int maiorPont = 0;
			int i;
			
			System.out.println(" Digite aqui 5 valores de pontuações: ");
			for(i = 0; i < pontuacoes.length; i++) {
				System.out.println((i + 1)+ "ª Potuação: ");
				pontuacoes[i] = leia.nextInt();
				
				if (pontuacoes[i] > maiorPont) {
					maiorPont = pontuacoes[i];
				}
				
			}
			System.out.println("A maior pontuação é: " + maiorPont);
			
			leia.close();
		}
	}

}
