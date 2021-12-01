package br.com.generation.aula01;

import java.util.Scanner;

public class Exercicio06 {
	
	/* 6 -Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3.
	  Para sair digitar 0(zero). */
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
        int i = 0, somaNum = 0, mediaNum, multiDeTres=0;
        
        System.out.println("Digite abaixo algum numero para realizar a média dos multiplos de 3 ou digite 0 para encerrar o programa.");
        
        do{ 

            i++;
            System.out.println("Digite o " + i + "º Número: ");
            num = leia.nextInt();
            if(num % 3 == 0) {
            
                somaNum = num + somaNum;
                multiDeTres++;
              }
            
        }while(num != 0);

        mediaNum = somaNum / multiDeTres;
        
        System.out.println("A média dos números múltiplos de 3 é: "+ mediaNum);
      
        leia.close();
	}
}
