package exemplo01;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar (CRIAR)
		//Objeto: Resultado obtido atrav�s da classe
		Pessoa p1 = new Pessoa();
		p1.nome   = "Ana";
		p1.altura = 1.71;
		p1.peso   = 60;
		p1.menssagem();
		double imc = p1.imc();
		System.out.println(imc);

	}

}
