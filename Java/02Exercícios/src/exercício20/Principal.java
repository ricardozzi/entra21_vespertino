package exerc�cio20;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String tabuada = ("informe o estado desejado: ");
	  	   tabuada += ("\n 1 - Santa Catarina");
	  	   tabuada += ("\n 2 - Paran�");
	  	   tabuada += ("\n 3 - Rio Grande do Sul");
	  	   tabuada += ("\n 4 - Rio de Janeiro");
	  	   
	  	int estado  = Integer.parseInt(JOptionPane.showInputDialog(tabuada));
	  	
	 	if (estado == 1) {
	 		JOptionPane.showMessageDialog(null,"Principal festa: Oktoberfest"+"\nPopula��o 1.000.000"+"\nAltitude: 5.926 mt n�vel do mar");
		}else 
			if (estado == 2) {
		 		JOptionPane.showMessageDialog(null, "Principal festa: Festa do vinho"+"\nPopula��o 2.000.000"+"\nAltitude: 6.926 mt n�vel do mar");
			}else 
				if (estado == 3) {
			 		JOptionPane.showMessageDialog(null, "Principal festa: Festa dos queijos"+"\nPopula��o 2.000.000"+"\nAltitude: 4.926 mt n�vel do mar");
				}else 
					if (estado == 4) {
				 		JOptionPane.showMessageDialog(null, "Principal festa: Carnaval"+"\nPopula��o 2.500.062"+"\nAltitude: 926 mt n�vel do mar");}
	
		

	}

}
