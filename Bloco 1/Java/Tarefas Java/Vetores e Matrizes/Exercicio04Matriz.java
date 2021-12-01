package br.com.generation.matriz;

import java.util.Scanner;

public class Exercicio04Matriz {
	
// 4 - Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
//	   em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
//	   diagonal, ou seja, diagonal principal.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] val = new int[3][3];
		int somaDiag = 0, somaVal = 0;
		
		// Inserindo valores
		for(int l = 0; l < val.length; l++) {
			for(int c = 0; c < val[l].length; c++) {
				System.out.printf("Digite os valores para preencher a matriz na posição [%d] | [%d]: ", l, c); // %d serve para puxar posição, tem que usar printf e , e por as variaveis (l, c)
				
				val[l][c] = leia.nextInt();
				
				somaVal += val[l][c]; // Soma de todos os valores, pegando cada linha e cada coluna [l] [c]
				if (l == c) {
					somaDiag += val[l][c]; // Somando a diagonal
				}
			}
		}
		// Mostrando os resultados
			System.out.println("\nA soma da matriz é: " + somaVal);
			System.out.println("A soma da diagonal é: " + somaDiag);
		leia.close();

	}

}
