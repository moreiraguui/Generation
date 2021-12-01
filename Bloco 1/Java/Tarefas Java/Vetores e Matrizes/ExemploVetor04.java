package br.com.generation.vetor;

import java.util.Scanner;

public class ExemploVetor04 {

	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			double[] notas = new double[4];
			double soma = 0.0, media = 0.0;
			int i;
			
			for(i = 0; i < notas.length; i++) {
				System.out.println("Digite as notas do Aluno: ");
				notas[i] = leia.nextDouble();
				soma = soma + notas[i];
				media = soma / notas.length;
				
			}
			System.out.println("A soma das notas é: " + soma);
			System.out.println("A media é: " + media);
				
			leia.close();
		}
	}
}
