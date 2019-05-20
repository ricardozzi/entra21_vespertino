package exemplo01;

//Classe: Molde
public class Pessoa {
	
	//Atributos: Características
	String nome;
	double altura, peso;
	
	//Métodos: Ações
	void menssagem() {
		System.out.println("Olá, meu nome é "+nome);
	}

	double imc () {
		return peso/(altura*altura);
	}
}
