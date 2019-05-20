package principal;

import java.util.ArrayList;
import java.util.LinkedList;
import pagamento.Credito;
import pagamento.Debito;

public class Principal {

	public static void main(String[] args) {
		
		//Poli    -> variás/muitas
		//Morphus -> Formas
		
		//Objeto
		Debito d = new Credito();
		d.tributos(100);
		d.msg();

		/*exemplo de Polimorfismo da classe Java.Util*/
//		List<String> nomes = new ArrayList<String>();
//		List<String> cidades = new LinkedList<String>();
	}

}