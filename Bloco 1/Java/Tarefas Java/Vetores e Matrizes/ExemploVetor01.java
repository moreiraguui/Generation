package br.com.generation.vetor;

public class ExemploVetor01 {

	public static void main(String[] args) {
	
		// array ---> arranjo
		int [] arrayVetor = new int[10]; //começa no 0 e termina no 9 (10 posições)
		
		arrayVetor[1] = 5;
		
		for (int i = 0; i <= 9; i++) {
			System.out.println(" | " + i + " | " + arrayVetor[i] + " | ");
			
			
		}
	}

}
