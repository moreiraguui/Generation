package Tarefas1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c, d, r, s;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		
		// r = ((a + b) ^ 2)
		r = (int) Math.pow((a + b), 2);
		
		//s = ((b + c) ^ 2)
		s = (int) Math.pow((b + c), 2);
		
		d = ((r + s) / 2);
		
		System.out.println(" O resultado da expressão D = ((R + S) / 2) é de: " + d);
			
		}
}
