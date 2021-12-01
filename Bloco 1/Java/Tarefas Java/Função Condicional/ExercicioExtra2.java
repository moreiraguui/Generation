package br.com.generation.aula02;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite três números: ");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		if(n1 <= n2 && n2 <= n3) {
			System.out.println("A 1ª ordem crescente é: \n" + n1 + " | " + n2 + " | " + n3);
		}
		else if(n1 <= n3 && n3 <= n2) {
			System.out.println("A 2ª ordem crescente é: \n" + n1 + " | " + n3 + " | " + n2);
		}		
		else if(n2 <= n1 && n1 <= n3) {
			System.out.println("A 3ª ordem crescente é: \n" + n2 + " | " + n1 + " | " + n3);
		}	
		else if(n2 <= n3 && n3 <= n1) {
			System.out.println("A 4ª ordem crescente é: \n" + n2 + " | " + n3 + " | " + n1);
		}			
		else if(n3 <= n1 && n1 <= n2) {
			System.out.println("A 5ª ordem crescente é: \n" + n3 + " | " + n1 + " | " + n2);
		}
		
		else {
			System.out.println("A 6ª ordem crescente é: \n " +  n3 + " | " + n2 + " | " + n1);
		
		}
		
		leia.close();
	}
		
}
