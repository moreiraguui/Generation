package br.com.generation.aula01;

public class Exercicio01 {

	/* Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. */

	public static void main(String[] args) {
	
		for(int i = 1000; i < 2000; i++) {
			
			if (i % 11 == 5) {
				System.out.println("Os n�meros que ap�s serem divididos por 11 possuem resto 5 s�o: " + i);
			}
		}

	}

}
