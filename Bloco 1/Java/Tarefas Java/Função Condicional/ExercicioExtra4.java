package br.com.generation.aula02;

import java.util.Scanner;

public class Exercicio4 {

	// 4 - Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este 	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	// �mpar exiba o n�mero elevado ao quadrado.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num,quadr; 
		double raiz;
		
		System.out.println("Digite um n�mero qualquer: ");
		num = leia.nextInt();
		
		quadr = (num * num);
		raiz = Math.sqrt(num);
		
		if (num % 2 == 1) {
			System.out.println("\nO n�mero digitado foi: " + num + " e este n�mero � impar!");
			System.out.println("\nEsse n�mero ao quadrado �: " + quadr);
			
		}
		
		else {
			System.out.println("\nO n�mero digitado foi: " + num + " e este n�mero � par!");
			System.out.println("\nA raiz quadrada deste n�mero �: " + raiz);
		
		}
		
			
		leia.close();

	}

}
