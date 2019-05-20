package exercício08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int valor1  = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 1 "));
		int valor2  = Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor 2 "));
		
		String tabuada = ("informe o número da operação: ");
	 	  	   tabuada += ("\n 1 - soma");
	 	  	   tabuada += ("\n 2 - subtração");
	 	  	   tabuada += ("\n 3 - multiplicação");
	 	  	   tabuada += ("\n 4 - divisão");
	 	  	   
	 	int operacao  = Integer.parseInt(JOptionPane.showInputDialog(tabuada));
	 	
	 	if (operacao == 1) {
	 		int result =valor1 + valor2;
	 		JOptionPane.showMessageDialog(null, ("Total : "+result));
		}else {
			if (operacao == 2) {
				int result =valor1 - valor2;
		 		JOptionPane.showMessageDialog(null, ("Total : "+result));
			}else {
				if (operacao == 3) {
					int result =valor1 * valor2;
			 		JOptionPane.showMessageDialog(null, ("Total : "+result));
				}else {
					if (operacao == 4) {
						int result =valor1 / valor2;
				 		JOptionPane.showMessageDialog(null, ("Total : "+result));}
				}
			}
		}
	 	  
	}

}
