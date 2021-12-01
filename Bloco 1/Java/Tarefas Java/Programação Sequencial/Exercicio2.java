package Tarefas1;

import java.util.Scanner;

public class Exercicio2 {

	// 2. - Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias = 0, meses = 0, anos = 0, dias2;
		
		String nome;
		
		System.out.println("Qual o seu nome? ");
		nome = leia.next();
		
		System.out.println("\nQual a sua idade em dias? ");
		dias = leia.nextInt();
		
		anos = (dias / 365);
		meses = ((dias % 365) / 30);
		
		dias2 = ((dias % 365) % 30);
															
		System.out.println("\nVocê possui " + anos + " anos " + ", " + meses + " meses e " + dias2 +  " dias de vida!");
			
		leia.close();
						
	}

}
