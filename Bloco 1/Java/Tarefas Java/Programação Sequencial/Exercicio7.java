package Tarefas1;

import java.util.Scanner;

public class Exercicio7 {

	// 7.	Um sistema de equações lineares do tipo: 
	// (a*x) + (b*y) = c  e (d*x) + (e*y) = f, pode ser resolvido segundo mostrado abaixo:
	// x = (((c*e) - (b*f)) / ((a*e) - (b*d)))  e   y = (((a*f) - (c*d)) / ((a*e) - (b*d)))
	// Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
		int x, y;
		
		System.out.println("Insira o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Insira o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Insira o valor de C: ");
		c = leia.nextInt();
		
		System.out.println("Insira o valor de D: ");
		d = leia.nextInt();
		
		System.out.println("Insira o valor de E: ");
		e = leia.nextInt();
		
		System.out.println("Insira o valor de F: ");
		f = leia.nextInt();
		
		
		x = (((c*e) - (b*f)) / ((a*e) - (b*d)));
		y = (((a*f) - (c*d)) / ((a*e) - (b*d)));
		
		System.out.println("\nO valor de x é: " + x + " \nO valor de y é: " + y);
		
		leia.close();

	}

}