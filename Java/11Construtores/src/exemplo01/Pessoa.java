package exemplo01;

public class Pessoa {
	
	//Método Construtor
	Pessoa(){
		System.out.println("Construtor ok");
	}
	//Método Construtor
	Pessoa(String nome){
		System.out.println(nome);
	}
	//Método Construtor
	Pessoa(String nome, int idade){
		System.out.println(nome+" " + idade);
	}
	

}
