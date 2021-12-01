package br.com.generation.lacofor;

public class ExemploFor2 {

	public static void main(String[] args) {
		
		int n = 10;
		int i, soma;
		
		for(i = 0, soma = 0; i <= n; i++) {
			
			System.out.print("Soma " + soma + " + " + i);
			soma = soma + i;
			System.out.print(" = " + soma + "\n");
		}

	}

}
