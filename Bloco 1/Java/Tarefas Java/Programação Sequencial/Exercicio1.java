package Tarefas1;

import java.util.Scanner;


public class Exercicio1 {

	// 1 - Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias. 
	// E mostre-a expressa apenas em dias
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias;
		
		String nome;
		
		System.out.println("Qual o seu nome? ");
		nome = leia.next();
		
		System.out.println("\nQuantos anos você tem? ");
		anos = leia.nextInt();
		
		System.out.println("\n" + anos + " anos e quantos meses você tem? ");
		meses = leia.nextInt();
		
		System.out.println("\nHá quantos dias você completou " + anos + " anos e " + meses + " meses?");
		dias = leia.nextInt();
		
		System.out.println("\nA idade de " + nome + " em dias é: " + ((anos * 365) + (meses * 30)));
		
		leia.close();

	}

}
