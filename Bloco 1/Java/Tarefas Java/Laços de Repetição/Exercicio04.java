package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio04 {
	/*
	4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es 	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150	pessoas, calcule e mostre:
	- o n�mero de pessoas calmas;
	- o n�mero de mulheres nervosas;
	- o n�mero de homens agressivos;
	- o n�mero de outros calmos;
	- o n�mero de pessoas nervosas com mais de 40 anos;
	- o n�mero de pessoas calmas com menos de 18 anos.
	*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		int feminino = 0, masculino = 0, outros = 0;
		int calmo1 = 0, calmo2 = 0, calmo3 = 0, nervosa1 = 0, nervosa2 = 0, nervosa3 = 0, agressiva1 = 0, agressiva2 = 0, agressiva3 = 0;
		int contagem = 0, sexo = 0, idade = 0, temperamento = 0, pessCalmaMenor18 = 0, pessNervoMaior40 = 0, mulheresNervosas = 0, homeAgressivo = 0, outrosCalmo = 0;
		
		while (contagem < 2) {
			contagem++;
									
			System.out.println("Digite aqui qual o seu sexo: \n1 - Feminino \n2 - Masculino \n3 - Outros");
			sexo = leia.nextInt();
						
			if (sexo == 1) {
				feminino++;
				System.out.println("Qual a sua idade? ");
				idade = leia.nextInt();
				System.out.println("Digite o n�mero correspondente para a sua personalidade: \n1 - Calma \n2 - Nervosa \n3 - Agressiva");
				temperamento = leia.nextInt();
			}
											
				if (temperamento == 1) {
					calmo1++;
				}
				if (temperamento == 2) {
					nervosa1++; 
				}
				if (temperamento == 2) {
					mulheresNervosas++;
				}
				if (temperamento == 3) {
					agressiva1++;
				}
				if (temperamento == 1 && idade <= 18) {
					pessCalmaMenor18++;
				}
				if (temperamento == 3 && idade >= 40) {
					pessNervoMaior40++;
				}
				
			if (sexo == 2) {
				masculino++;
				System.out.println("Qual a sua idade? ");
				idade = leia.nextInt();
				System.out.println("Digite o n�mero correspondente para a sua personalidade: \n1 - Calma \n2 - Nervosa \n3 - Agressiva");
				temperamento = leia.nextInt();
				}							
				if (temperamento == 1) {
					calmo2++;
				}
				if (temperamento == 2) {
					nervosa2++;
				}
				if (temperamento == 3) {
					agressiva2++; 
				}
				if (temperamento == 3) {
					homeAgressivo++;
				}
				if (temperamento == 1 && idade <= 18) {
					pessCalmaMenor18++;
				}
				if (temperamento == 3 && idade >= 40) {
					pessNervoMaior40++;
				}
				
			if (sexo == 3) {
				outros++;
				System.out.println("Qual a sua idade? ");
				idade = leia.nextInt();
				System.out.println("Digite o n�mero correspondente para a sua personalidade: \n1 - Calma \n2 - Nervosa \n3 - Agressiva");
				temperamento = leia.nextInt();
				}
				if (temperamento == 1) {
					calmo3++; 
				}
				if (temperamento == 1) {
					outrosCalmo++;
				}
				if (temperamento == 2) {
					nervosa3++;
				}
				if (temperamento == 3) {
					agressiva3++;
				}
				if (temperamento == 1 && idade <= 18) {
					pessCalmaMenor18++;
				}
				if (temperamento == 3 && idade >= 40) {
					pessNervoMaior40++;
				}
		}
	
	
					System.out.println("O numero de pessoas calmas �: " + (calmo1 + calmo2 + calmo3));
					System.out.println("O n�mero de mulheras nervosas �: " + mulheresNervosas);
					System.out.println("O n�mero de homens agressivos �: " + homeAgressivo);
					System.out.println("O n�mero de outros calmos �: " + outrosCalmo);
					System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: " + pessNervoMaior40);
					System.out.println("O n�mero de pessoas calmas com menos de 18 anos �: " + pessCalmaMenor18);
		
	}
	}
	


			
				
		
		
	
		
	



