package br.com.generation.aula02;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite tr�s n�meros: ");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		if(n1 <= n2 && n2 <= n3) {
			System.out.println("A 1� ordem crescente �: \n" + n1 + " | " + n2 + " | " + n3);
		}
		else if(n1 <= n3 && n3 <= n2) {
			System.out.println("A 2� ordem crescente �: \n" + n1 + " | " + n3 + " | " + n2);
		}		
		else if(n2 <= n1 && n1 <= n3) {
			System.out.println("A 3� ordem crescente �: \n" + n2 + " | " + n1 + " | " + n3);
		}	
		else if(n2 <= n3 && n3 <= n1) {
			System.out.println("A 4� ordem crescente �: \n" + n2 + " | " + n3 + " | " + n1);
		}			
		else if(n3 <= n1 && n1 <= n2) {
			System.out.println("A 5� ordem crescente �: \n" + n3 + " | " + n1 + " | " + n2);
		}
		
		else {
			System.out.println("A 6� ordem crescente �: \n " +  n3 + " | " + n2 + " | " + n1);
		
		}
		
		leia.close();
	}
		
}
