package br.com.generation.herancaEx;

public class TestaAnimal {
	
/*	 1 - Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), 
	 utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os animais fique na classe 
	 Animal: */
	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro ();
		Cavalo cv1 = new Cavalo ();
		Preguiça pr1 = new Preguiça ();
		
		c1.setNome("O cachorro se chama - Dog Malvadão");
		c1.setEspecie("Cachorro");
		c1.setRaca("Vira Lata");
		c1.setIdade(20);
		c1.setPorte("Médio");
		c1.setMovimentacao("Correr");
		c1.setEmitirSom("Au Au");
		
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Espécie: " + c1.getEspecie());
		System.out.println("Raça: " + c1.getRaca());
		System.out.println("Idade: " + c1.getIdade() + " anos");
		System.out.println("Porte: " + c1.getPorte());
		System.out.println("Movimentação: " + c1.getMovimentacao());
		System.out.println("Som emitido: " + c1.getEmitirSom());
		
		System.out.println();
		
		cv1.setNome("\nO cavalo se chama - Pé de Pano");
		cv1.setEspecie("Cavalo");
		cv1.setRaca("Quarto de Milha");
		cv1.setIdade(20);
		cv1.setPorte("Grande");
		cv1.setMovimentacao("Correr");
		cv1.setEmitirSom("Iiirrrrí, ihóm ihóm");
		
		System.out.println("Nome: " + cv1.getNome());
		System.out.println("Espécie: " + cv1.getEspecie());
		System.out.println("Raça: " + cv1.getRaca());
		System.out.println("Idade: " + cv1.getIdade() + " anos");
		System.out.println("Porte: " + cv1.getPorte());
		System.out.println("Movimentação: " + cv1.getMovimentacao());
		System.out.println("Som emitido: " + cv1.getEmitirSom());
		
		System.out.println();
		
		pr1.setNome("A preguiça se chama - Zé Brasil");
		pr1.setEspecie("Preguiça");
		pr1.setRaca("Preguila-Real");
		pr1.setIdade(3);
		pr1.setPorte("Pequeno");
		pr1.setMovimentacao("Subir em árvore");
		pr1.setEmitirSom("ZzzzZzZ zzZzZzzZZz");
		
		System.out.println("Nome: " + pr1.getNome());
		System.out.println("Espécie: " + pr1.getEspecie());
		System.out.println("Raça: " + pr1.getRaca());
		System.out.println("Idade: " + pr1.getIdade() + " anos");
		System.out.println("Porte: " + pr1.getPorte());
		System.out.println("Movimentação: " + pr1.getMovimentacao());
		System.out.println("Som emitido: " + pr1.getEmitirSom());

	}

}
