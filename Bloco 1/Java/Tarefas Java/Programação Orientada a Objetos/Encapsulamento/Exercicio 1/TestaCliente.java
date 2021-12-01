package ExerciciosPOO;


public class TestaCliente {
	
	public static void main(String[] args) {
	
		Cliente c1 = new Cliente();
			
		c1.setNome("Guilherme Moreira");
		c1.setSexo("Masculino");
		c1.setIdade(23);
		c1.setEstadoCivil("Solteiro");
		c1.setEndereco("Rua Corinthians - 1910");
		
		System.out.println("-------------------------------");
		System.out.println("| Informações sobre o cliente |");
		System.out.println("-------------------------------");
		System.out.println();
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Sexo: " + c1.getSexo());
		System.out.println("Idade: " + c1.getIdade());
		System.out.println("Estado Civil: " + c1.getEstadoCivil());
		System.out.println("Endereço: " + c1.getEndereco());


	}

}