package br.com.generation.vetor;

public class ExemploVetor03 {

	public static void main(String[] args) {
		
		double[] graus = new double[10];
		
		graus[0] = 27.6;
		graus[1] = 35.6;
		graus[2] = 21.3;
		graus[3] = 12.5;
		graus[4] = 15.6;
		
		System.out.println("A temperatura no 2º dia de dezembro: " + graus[3] + "°C");	
		System.out.println("O tomanho do array: " + graus.length);
		for (int i = 0; i < graus.length; i++) {
			System.out.println(" | No " + (i + 1) + "°" + " dia a temperatura foi: " + graus[i] + "°C | ");
		}
	}

}
