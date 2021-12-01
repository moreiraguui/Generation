package Tarefas1;

import java.util.Scanner;

public class Exercicio8 {
	
	// 8.	O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
	// Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoca, custoco;
		
		System.out.println("Qual o custo de fabricação deste veiculo ? ");
		custoca = leia.nextInt();
		
		custoco = ((custoca * 0.28) + (custoca * 0.45) + custoca);
		
		System.out.println("\nConsumidor, o valor final do seu veículo será de: R$ " + custoco);
		
		leia.close();
	}
	
}