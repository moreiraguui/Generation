package Tarefas1;

import java.util.Scanner;

public class Exercicio5 {
	
	// 5 - Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
	// Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, med;
		
		System.out.println("Digite aqui a sua primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite aqui a sua segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Digite aqui a sua terceira nota: ");
		nota3 = leia.nextDouble();
		
		med = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5);
				
		System.out.println("A sua m�dia �: " + med);
		
		leia.close();
	}
}
