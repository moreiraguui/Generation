package br.com.generation.aula02;

import java.util.Scanner;

public class Exercicio1 {

	// Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
	// -	10-14 infantil
	// -	15-17 juvenil
	// - 	18-25 adulto
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int idade;
		
		System.out.println("Digite aqui a sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("\nVoc� possui " + idade + " anos e a sua categoria de idade �: Infantil (10 a 14 anos).");
		}
		
		if (idade >= 15 && idade <= 17) {
			System.out.println("\nVoc� posui " + idade + " anos e a sua categoria de idade �: Juvenil (15 a 17 anos).");
		}
		
		if (idade >= 18 && idade <= 25) {
			System.out.println("\nVoc� possui " + idade + " anos e a sua categoria de idade �: Adulto (18 a 25 anos).");
		}
		
		leia.close();
		
		
	}

}
