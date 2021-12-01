package br.com.generation.herancaEx;

public class Animal {
	
/* 	1 - Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela), 
	utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os animais fique na classe 
	Animal: */
	
	// Atributos
	private String especie, raca, porte, nome;
	private int idade;
	private String emitirSom;
	
	// Métodos
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmitirSom() {
		return emitirSom;
	}
	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
}
