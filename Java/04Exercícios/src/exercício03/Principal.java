package exercício03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Object[] continuar = {"Fechar Pedido","Acrescentar ao pedido"};
		double valor = 0, conta = 0, troco = 0, conta2 = 0;
		int    codigo = 0, quant2 = 0,continua = 0;
		
		do {
			
			String resultado ="Informações dos cadastrados:";
			       resultado+="\n1 - Hambúrguer + Suco de Laranja   - R$ 5,00";
			       resultado+="\n2 - Sanduíche natural + Suco de Uva- R$ 4,50";
			       resultado+="\n3 - Prato do dia                   - R$ 8,00";
			       resultado+="\n4 - Pizza                          - R$ 12,00";
			       resultado+="\n5 - Lasanha                        - R$ 16,50";
			       resultado+="\n6 - Pão de queijo                  - R$ 1,00";
			       resultado+="\n7 - Bolo                           - R$ 2,50";
	
			codigo= Integer.parseInt(JOptionPane.showInputDialog(null, resultado));
			   
			quant2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do pedido:"));
			
			
			if (codigo == 1) {
				conta = quant2 * 5;
			}else
				if (codigo == 2) {
					conta = quant2 * 4.5;
				}else
					if (codigo == 3) {
						conta = quant2 * 8;
					}else
						if (codigo == 4) {
							conta = quant2 * 12;
						}else
							if (codigo == 5) {
								conta = quant2 * 16.5;
							}else
								if (codigo == 6) {
									conta = quant2 * 1;
								}else
									conta = quant2 *2.5;
			
			conta2 = conta + conta2;
			continua = JOptionPane.showOptionDialog(null,"","Aba de finalização",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,continuar,0);
			
			} while (continua == 1);
		
		do {
			
			valor= Double.parseDouble(JOptionPane.showInputDialog( "O valor da conta é "+conta2+" R$"+" \nInforme o valor para pagar a conta:"));
			
			} while (valor<conta2);
			
		JOptionPane.showMessageDialog(null, "O troco é de "+ (valor - conta2)+" R$");

	}

}
