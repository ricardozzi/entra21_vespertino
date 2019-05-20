package exercício29;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String tabuada = ("informe o País desejado: ");
	  	   tabuada += ("\n 1 - Canadá");
	  	   tabuada += ("\n 2 - Nova Zelândia");
	  	   tabuada += ("\n 3 - Austrália");
	  	   
	  	   
	  	int pais  = Integer.parseInt(JOptionPane.showInputDialog(tabuada));
	  	int hora  = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora atual:"));
	  	int can   = hora+12;
	  	int novaz = hora+9;
	  	int aust  = hora+14;
	  	
	 	if ((pais == 1)&& (can<23)) {
	 		JOptionPane.showMessageDialog(null,"Agorna no Canadá são "+(can)+" horas");
		}else 
			if ((pais == 1)&&(can>23)) {
		 		JOptionPane.showMessageDialog(null, "Agorna no Canadá são "+(can-24)+" horas");
			}else 
			 	if ((pais == 2)&& (novaz<23)) {
			 		JOptionPane.showMessageDialog(null,"Agorna no Nova Zelândia são "+(novaz)+" horas");
				}else 
					if ((pais == 2)&&(novaz>23)) {
				 		JOptionPane.showMessageDialog(null, "Agorna no Nova Zelândia são "+(novaz-24)+" horas");
					}else
					 	if ((pais == 3)&& (aust<23)) {
					 		JOptionPane.showMessageDialog(null,"Agorna no Autrália são "+(aust)+" horas");
						}else 
							if ((pais == 3)&&(aust>23)) {
						 		JOptionPane.showMessageDialog(null, "Agorna no Austrália são "+(aust-24)+" horas");
							}
	

	}

}
