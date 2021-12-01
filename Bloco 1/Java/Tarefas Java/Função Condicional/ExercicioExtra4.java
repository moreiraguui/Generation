package br.com.generation.aula02;

import java.util.Scanner;

public class Exercicio4 {

	// 4 - Faça um programa em que permita a entrada de um número qualquer e exiba se este 	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	// ímpar exiba o número elevado ao quadrado.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num,quadr; 
		double raiz;
		
		System.out.println("Digite um número qualquer: ");
		num = leia.nextInt();
		
		quadr = (num * num);
		raiz = Math.sqrt(num);
		
		if (num % 2 == 1) {
			System.out.println("\nO número digitado foi: " + num + " e este número é impar!");
			System.out.println("\nEsse número ao quadrado é: " + quadr);
			
		}
		
		else {
			System.out.println("\nO número digitado foi: " + num + " e este número é par!");
			System.out.println("\nA raiz quadrada deste número é: " + raiz);
		
		}
		
			
		leia.close();

	}

}
