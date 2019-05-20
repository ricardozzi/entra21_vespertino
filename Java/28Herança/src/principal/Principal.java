package principal;

import cargos.Analista;
import cargos.Desenvolvedor;
import cargos.Estagiario;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar objetos
		Desenvolvedor d = new Desenvolvedor("Desenvolvedor Jr", 2000);
		Analista a = new Analista("Analista Pleno", 4000);
		Estagiario e = new Estagiario("Estagiário", 1000);
		
		//Vale Transporte
		d.valeTransporte();
		a.valeTransporte();
		e.valeTransporte();

		//IR
		d.impostoRenda();
		a.impostoRenda();
		e.impostoRenda();
	}

}
