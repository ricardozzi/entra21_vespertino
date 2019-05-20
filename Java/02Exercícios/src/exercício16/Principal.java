package exercício16;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int pedido  = Integer.parseInt(JOptionPane.showInputDialog("Informe o número do pedido: "));
		int paga    = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor pago: "));
		
		if (pedido == 1) {
	 		double result = paga - 5;
	 		JOptionPane.showMessageDialog(null, ("Código: 2 "+"Troco: "+result+" Preço R$ 4,50"));
		}else 
			if (pedido == 2) {
				double result = paga - 4.5;
		 		JOptionPane.showMessageDialog(null, ("Código: 2 "+" Troco: "+result+" Preço R$ 4,50"));
			}else 
				if (pedido == 3) {
					double result = paga - 8;
			 		JOptionPane.showMessageDialog(null, ("Código: 2 "+"Troco: "+result+" Preço R$ 4,50"));
				}else 
					if (pedido == 4) {
						double result = paga - 12;
				 		JOptionPane.showMessageDialog(null, ("Código: 2 "+"Troco: "+result+" Preço R$ 4,50"));}
					else
						if (pedido == 1) {
				 		double result = paga - 16.5;
				 		JOptionPane.showMessageDialog(null, ("Código: 2 "+"Troco: "+result+" Preço R$ 4,50"));
					}else 
						if (pedido == 2) {
							double result = paga - 1;
					 		JOptionPane.showMessageDialog(null, ("Código: 2 "+"Troco: "+result+" Preço R$ 4,50"));
						}else 
							if (pedido == 3) {
								double result = paga - 2.5;
						 		JOptionPane.showMessageDialog(null, ("Código: 2 "+"Troco: " +result+"Preço R$ 4,50"));
							}else { 
								JOptionPane.showMessageDialog(null, ("número do pedido inválido"));}
							
						
					
				
			
						
					
				
			}
		
	}

