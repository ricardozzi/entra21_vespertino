package exemplo01;

public class Produto {
	
	//Contador
	private static int contador = 0;
	
	//Construtor
	public Produto() {
		contador++;
		System.out.println(contador);
	}

}
