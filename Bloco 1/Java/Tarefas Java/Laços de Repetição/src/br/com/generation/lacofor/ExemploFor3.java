package br.com.generation.lacofor;

public class ExemploFor3 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int sobe = 0, desce = 10; sobe <= 10 && desce >= 0; sobe++, desce--) {
			System.out.println(sobe + "  |  " + desce);
			Thread.sleep(700);
		}
	}

}
