package br.com.generation.lacowhile;

public class ExemploWhile1 {

	public static void main(String[] args) throws InterruptedException {
		
		int contador = 1;
				
		while(contador <= 10) {
			System.out.println("Repeti��o:  nr " + contador);
			contador++;	
			Thread.sleep(500); // 1000 mili seg = 1 segundo
		}
		
		

	}

}
