package br.com.generation.matriz;

public class ExemploMatriz01 {

	public static void main(String[] args) {
		
		double[][] notasAluno = new double[2][4];
		
		notasAluno[0][0] = 9.5;
		notasAluno[0][1] = 5.5;
		notasAluno[0][2] = 8.2;	
		notasAluno[0][3] = 4.0;
		
		notasAluno[1][0] = 8.8;
		notasAluno[1][1] = 9.2;
		notasAluno[1][2] = 7.0;
		notasAluno[1][3] = 9.9;
		
		for(int l = 0; l < notasAluno.length; l++) { // - Caminha sobre as linhas
			for(int c = 0; c < notasAluno[l].length; c++) { // - Caminhar sobre as colunas
				System.out.print("| " + notasAluno[l][c] + " | ");
			}
			System.out.println();
		}
	}
}
