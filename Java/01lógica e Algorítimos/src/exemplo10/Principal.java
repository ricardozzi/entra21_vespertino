package exemplo10;

public class Principal {

	public static void main(String[] args) {
		
		/*
		  Operadores L�gicos
		  && = E
		  || = OU
		  !  = N�O
		 */
		
		String segmento = "eletr�nico";
		double valor    = 100;
		
		if((segmento.equals("eletr�nico"))&&(valor > 100)) {
			System.out.println("Desconto de 10% - R$" + valor * 0.9);
		}else {
			System.out.println("Sem Desconto - R$" + valor);}
		
		
	}

}
