package exemplo09;

public class Principal {

	public static void main(String[] args) {
		
		//Condicional Alinhada
		String segmento = "eletr�nicoS";
		double valor    = 500;
		
		if(segmento.equals("eletr�nico")){
			if(valor >= 500) {
				System.out.println("Desconto de 20%, total R$ " + valor * 0.8);}
			else{
				System.out.println("Desconto de 10%, total R$ " + valor * 0.9);
				}
		}else {
			if (valor >= 500 ) {
				System.out.println("Desconto de 5%, total R$ " + valor * 0.95);
			}else {
				System.out.println("Sem Desconto, total R$ " + valor);
			}
			
			
		}
		
		
		
		
	}

}
