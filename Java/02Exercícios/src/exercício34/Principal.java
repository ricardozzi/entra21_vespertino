package exercício34;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double vlraplic = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da aplicação: "));
		
		double poup = vlraplic*0.044;
		double cdb  = vlraplic*0.0465;
		double lci  = vlraplic*0.058;
		
		String orc = ("Orçamentos: ");
		   orc += ("\nPoupança - "+poup);	
	 	   orc += ("\nCDB         - "+cdb);
	 	   orc += ("\nLCI           - "+lci);
	 	   
	 	JOptionPane.showMessageDialog(null, orc);

	}

}
