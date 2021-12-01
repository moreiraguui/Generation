package Tarefas1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
		double p1, p2, x1, x2, y1, y2, d;
		
		System.out.println("Digite o primeiro ponto de x (x1): ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o segundo ponto de x (x2): ");
		x2 = leia.nextDouble();
		
		System.out.println("Digite o primeiro ponto de y (y1): ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite o segundo ponto de y (y2): ");
		y2 = leia.nextDouble();
		
		p1 = Math.pow((x2 - x1), 2);
		p2 = Math.pow((y2 - y1), 2);
		
		d = Math.sqrt(p1 + p2);
		
		System.out.println("A distância entre os planos p1 e p2 é de: " + d);
		
		leia.close();
	
	}
	
}
