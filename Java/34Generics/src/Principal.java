
public class Principal {
	
	/*
	E: Elemento de calsse(String, Double, integer, ArrayList)
	T: Elementos de tipo (char, int, double, float, short, long)
	K: Chaves (HashMap)
	V: calor  (HashMap)
	*/
	
	//M�todo Gen�rico
	public static <E> void listar(E[] vetor) {
		for (E elemento : vetor) {
			System.out.println(elemento+" ");
		}
	}
	
	//M�ttodo Principal
	public static void main(String[] args) {
		// Vetores
		String []   nomes = {"Suelem","Cleiton","Paloma"};
		Integer[]  idades = {22,30,17};
		Double [] alturas = {1.70,1.77,1.64};
		
		//Chamar o m�todo de listar
		listar(idades);
		
	}

}
