package exerc�cio29;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String tabuada = ("informe o Pa�s desejado: ");
	  	   tabuada += ("\n 1 - Canad�");
	  	   tabuada += ("\n 2 - Nova Zel�ndia");
	  	   tabuada += ("\n 3 - Austr�lia");
	  	   
	  	   
	  	int pais  = Integer.parseInt(JOptionPane.showInputDialog(tabuada));
	  	int hora  = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora atual:"));
	  	int can   = hora+12;
	  	int novaz = hora+9;
	  	int aust  = hora+14;
	  	
	 	if ((pais == 1)&& (can<23)) {
	 		JOptionPane.showMessageDialog(null,"Agorna no Canad� s�o "+(can)+" horas");
		}else 
			if ((pais == 1)&&(can>23)) {
		 		JOptionPane.showMessageDialog(null, "Agorna no Canad� s�o "+(can-24)+" horas");
			}else 
			 	if ((pais == 2)&& (novaz<23)) {
			 		JOptionPane.showMessageDialog(null,"Agorna no Nova Zel�ndia s�o "+(novaz)+" horas");
				}else 
					if ((pais == 2)&&(novaz>23)) {
				 		JOptionPane.showMessageDialog(null, "Agorna no Nova Zel�ndia s�o "+(novaz-24)+" horas");
					}else
					 	if ((pais == 3)&& (aust<23)) {
					 		JOptionPane.showMessageDialog(null,"Agorna no Autr�lia s�o "+(aust)+" horas");
						}else 
							if ((pais == 3)&&(aust>23)) {
						 		JOptionPane.showMessageDialog(null, "Agorna no Austr�lia s�o "+(aust-24)+" horas");
							}
	

	}

}
