package br.com.generation.lacowhile;

public class ExemploWhile2 {

	public static void main(String[] args) throws InterruptedException {
		
		int contador = 10;
		
		while (contador > 0) {
			System.out.println("Repeti��o: Num �: " +  contador);
			contador--;
			Thread.sleep(500);
			
		}

	}

}
