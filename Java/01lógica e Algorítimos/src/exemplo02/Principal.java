package exemplo02;

public class Principal {

	public static void main(String[] args) {
		
		//Números inteiros
		byte  numero1  = 10; //-128 até 127
		short numero2  = 33; //-32.768 até 32.767
		int   numero3  = 50; //-2.147.483.648 até 2.147.483.647
		long  numero4  = 100;//-9.223.372.036.854.775.808 até 9.223.372.036.854.775.808
		
		//Números reais
		float  numero5 = 7.59f;//com até 7 casas decimais
		double numero6 = 8.33;//com até 15 casas decimais
		
		//Lógico
		boolean acao = true; //True ou False
		
		//Letra
		char letra = 'a';//obter apenas uma letra
		char ascii =  65;//converter código em uma tela
		
		//Texto
		String texto = "Aprendendo Java na Proway";
		
		//Concatenação -/- Junção
		System.out.println("O valor da variável byte é "   +numero1);
		System.out.println("O valor da variável short é "  +numero2);
		System.out.println("O valor da variável int é "    +numero3);
		System.out.println("O valor da variável long é "   +numero4);
		System.out.println("O valor da variável float é "  +numero5);
		System.out.println("O valor da variável double é " +numero6);
		System.out.println("O valor da variável boolean é "+acao);
		System.out.println("O valor da variável char é "   +letra);
		System.out.println("O valor da variável char é "   +ascii);
		System.out.println("O valor da variável String é " +texto);
	}
}
