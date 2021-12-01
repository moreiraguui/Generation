package br.com.generation.aula02;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double imc; // Indice de massa corporea
		double	pesoQuilogramas = 0.0;
		double alturaMetros = 0.0;
		
		System.out.println("Digite o seu peso atual: ");
		pesoQuilogramas = leia.nextDouble();
		
		System.out.println("\nDigite aqui a sua altura: ");
		alturaMetros = leia.nextDouble();
		
		imc = pesoQuilogramas / (alturaMetros * alturaMetros);
		
		System.out.println("\nValores de IMC");
		
		System.out.println("Abaixo do peso: Menor do que 18,5.");
		System.out.println("Normal: Entre 18,5 e 24,9.");
		System.out.println("Sobrepeso: Entre 25,0 e 29,9");
		System.out.println("Obesidade: Acima de 30,0");
		System.out.println("\n O seu IMC é: " + imc);
		
		if(imc < 18.5) {
			System.out.println("\nVocê está abaixo do peso, por favor coma mais!");
		}
		if (imc > 18.5 && imc < 24.9 ) {
			System.out.println("\nParabéns você está com o peso normal!");
		}
		if (imc > 25.0 && imc < 29.9) {
			System.out.println("\nVocê está com sobrepeso, verifique sua alimentação e faça exercicios!");
		}
		if (imc > 30.0) {
			System.out.println("Você está obeso! Procure um médico imediatamente!!!!");
		}
		
		leia.close();
		
	}
	}

