package br.com.generation.aula02;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma letra entre A e D: ");
		String letra = leia.next();

		switch (letra) {
		case "a", "A":
			System.out.println("Analonguinea");
		break;
		
		case "b", "B":
			System.out.println("Brubinha");
		break;
		
		case "c", "C":
			System.out.println("Carambolas");
		break;
		
		case "d", "D":
			System.out.println("Dedisvaldo");
		break;
		
		default:
			System.out.println("Digite uma opção válida! Tente Novamente. " + 
		"\nPrograma encerrado...");
		
		leia.close();
		
		}
	}

}
