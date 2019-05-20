package exercício15;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int dias  = Integer.parseInt(JOptionPane.showInputDialog("Informe o quantos dias deseja ficar:"));
		
		String tabuada = ("Escolha o tipo de apartamento:");
	 	  	   tabuada += ("\n 1 - apto simples");
	 	  	   tabuada += ("\n 2 - apto duplo");
	 	  	   tabuada += ("\n 3 - suíte de luxo");
	 	  	   
	 	int apt  = Integer.parseInt(JOptionPane.showInputDialog(tabuada));
	 	
	 	if (apt == 1) {
	 		double result = dias*45;
	 		JOptionPane.showMessageDialog(null, ("Total : "+result));
		}else {
			if (apt == 2) {
				double result = dias*65;;
		 		JOptionPane.showMessageDialog(null, ("Total : "+result));
			}else {
				if (apt == 3) {
					double result = dias*110;
			 		JOptionPane.showMessageDialog(null, ("Total : "+result));
				
				}
			}
		}
	 	
	}

}
