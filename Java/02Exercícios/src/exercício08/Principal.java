package exerc�cio08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int valor1  = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 1 "));
		int valor2  = Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor 2 "));
		
		String tabuada = ("informe o n�mero da opera��o: ");
	 	  	   tabuada += ("\n 1 - soma");
	 	  	   tabuada += ("\n 2 - subtra��o");
	 	  	   tabuada += ("\n 3 - multiplica��o");
	 	  	   tabuada += ("\n 4 - divis�o");
	 	  	   
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
