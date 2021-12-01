package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio02 {
	
	/* 2 -  Ler 10 números e imprimir quantos são pares e quantos são ímpares.
	 
	 */

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int i, num, par = 0, imp = 0;
		
		for(i = 1; i <= 10; i++) {
		
		System.out.println("Digite aqui o " + i + "º número: ");
		num = leia.nextInt();
		
		if(num % 2 == 1) {
			imp++;
		}
			else {
			par++;
		}
					
		System.out.println("O total de números pares é: " + par + " e o total de números impares é: " + imp + ".");
			
		leia.close();
		
	}

}
