package exercício20;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String tabuada = ("informe o estado desejado: ");
	  	   tabuada += ("\n 1 - Santa Catarina");
	  	   tabuada += ("\n 2 - Paraná");
	  	   tabuada += ("\n 3 - Rio Grande do Sul");
	  	   tabuada += ("\n 4 - Rio de Janeiro");
	  	   
	  	int estado  = Integer.parseInt(JOptionPane.showInputDialog(tabuada));
	  	
	 	if (estado == 1) {
	 		JOptionPane.showMessageDialog(null,"Principal festa: Oktoberfest"+"\nPopulação 1.000.000"+"\nAltitude: 5.926 mt nível do mar");
		}else 
			if (estado == 2) {
		 		JOptionPane.showMessageDialog(null, "Principal festa: Festa do vinho"+"\nPopulação 2.000.000"+"\nAltitude: 6.926 mt nível do mar");
			}else 
				if (estado == 3) {
			 		JOptionPane.showMessageDialog(null, "Principal festa: Festa dos queijos"+"\nPopulação 2.000.000"+"\nAltitude: 4.926 mt nível do mar");
				}else 
					if (estado == 4) {
				 		JOptionPane.showMessageDialog(null, "Principal festa: Carnaval"+"\nPopulação 2.500.062"+"\nAltitude: 926 mt nível do mar");}
	
		

	}

}
