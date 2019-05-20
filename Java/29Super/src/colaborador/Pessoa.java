package colaborador;

public class Pessoa {

	//Atributos
	private String nomePessoa, enderecoPessoa;
	private int idadePessoa;
	
	//Construtor
	public Pessoa (String nomePessoa, String enderecoPessoa, int idadePessoa) {
		this.nomePessoa = nomePessoa;
		this.enderecoPessoa = enderecoPessoa;
		this.idadePessoa = idadePessoa;
		
		exibirDadosPessoa();
	}
	
	//M�todo para exibir dados pessoais
	private void exibirDadosPessoa() {
		System.out.println("Nome: "+nomePessoa);
		System.out.println("Endere�o: "+enderecoPessoa);
		System.out.println("Idade: "+idadePessoa);
		
	}
}
