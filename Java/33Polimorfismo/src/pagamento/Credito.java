package pagamento;

public class Credito extends Debito{
	
	//M�todo de tributos
	public void tributos(double valor) {
		System.out.println(valor*0.04);
	}

}
