package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio02 {
	
	/* 2 -  Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
	 
	 */

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int i, num, par = 0, imp = 0;
		
		for(i = 1; i <= 10; i++) {
		
		System.out.println("Digite aqui o " + i + "� n�mero: ");
		num = leia.nextInt();
		
		if(num % 2 == 1) {
			imp++;
		}
			else {
			par++;
		}
					
		System.out.println("O total de n�meros pares �: " + par + " e o total de n�meros impares �: " + imp + ".");
			
		leia.close();
		
	}

}
