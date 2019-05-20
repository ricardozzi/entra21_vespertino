package exercício32;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double vlorca  = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
		
		String tabuada = ("Orçamentos: ");
		   tabuada += ("\n");	
	 	   tabuada += ("\n5%"  +" 30 dias     " + (vlorca+(vlorca*0.05)));
	 	   tabuada += ("\n10%" +" 60 dias     " + (vlorca+(vlorca*0.10)));
	 	   tabuada += ("\n20%" +" 90 dias     " + (vlorca+(vlorca*0.20)));
	 	   tabuada += ("\n30%" +" 120 dias    " + (vlorca+(vlorca*0.30)));
	 	   tabuada += ("\n40%" +" 180 dias    " + (vlorca+(vlorca*0.40)));
	 	   tabuada += ("\n5%0" +" 270 dias    " + (vlorca+(vlorca*0.50)));
	 	   
	 	  JOptionPane.showMessageDialog(null, tabuada);

	}

}
