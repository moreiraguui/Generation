package br.com.generation.lacowhile;

import java.util.Scanner;

public class ExemploWhile3 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner leia = new Scanner(System.in);
		int numero = -1;
		
		while(numero != 0) {
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			Thread.sleep(500);
			
			if (numero == 0) {
				System.out.println("Voc� digitou 0 e o programa ser� encerrado...");
			}
		}

		leia.close();
	}
	
	

}
