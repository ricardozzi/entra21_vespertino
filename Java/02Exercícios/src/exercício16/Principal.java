package exerc�cio16;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int pedido  = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero do pedido: "));
		int paga    = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor pago: "));
		
		if (pedido == 1) {
	 		double result = paga - 5;
	 		JOptionPane.showMessageDialog(null, ("C�digo: 2 "+"Troco: "+result+" Pre�o R$ 4,50"));
		}else 
			if (pedido == 2) {
				double result = paga - 4.5;
		 		JOptionPane.showMessageDialog(null, ("C�digo: 2 "+" Troco: "+result+" Pre�o R$ 4,50"));
			}else 
				if (pedido == 3) {
					double result = paga - 8;
			 		JOptionPane.showMessageDialog(null, ("C�digo: 2 "+"Troco: "+result+" Pre�o R$ 4,50"));
				}else 
					if (pedido == 4) {
						double result = paga - 12;
				 		JOptionPane.showMessageDialog(null, ("C�digo: 2 "+"Troco: "+result+" Pre�o R$ 4,50"));}
					else
						if (pedido == 1) {
				 		double result = paga - 16.5;
				 		JOptionPane.showMessageDialog(null, ("C�digo: 2 "+"Troco: "+result+" Pre�o R$ 4,50"));
					}else 
						if (pedido == 2) {
							double result = paga - 1;
					 		JOptionPane.showMessageDialog(null, ("C�digo: 2 "+"Troco: "+result+" Pre�o R$ 4,50"));
						}else 
							if (pedido == 3) {
								double result = paga - 2.5;
						 		JOptionPane.showMessageDialog(null, ("C�digo: 2 "+"Troco: " +result+"Pre�o R$ 4,50"));
							}else { 
								JOptionPane.showMessageDialog(null, ("n�mero do pedido inv�lido"));}
							
						
					
				
			
						
					
				
			}
		
	}

