package Tarefas1;

import java.util.Scanner;

public class Exercicio3 {

	// 3 - Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int segundos = 0, horas = 0, minutos = 0, segundos2 = 0;
		
		System.out.println("Quantos segundos ter� de dura��o o evento? ");
		segundos = leia.nextInt();
		
		horas = (segundos / 3600);
		minutos = ((segundos % 3600) / 60);
		segundos2 = ((segundos % 3600) % 60);
				
		System.out.println("\nO evento ir� durar " + horas + " horas, " + minutos + " minutos e " + segundos2 + " segundos.");
		
		leia.close();
					
	}
	
}
