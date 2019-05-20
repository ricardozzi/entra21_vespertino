package exercício14;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double vlrveic = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
		
		
		if (vlrveic <= 12000.00) {
			String tabuada = ("valor do veículo    % do distribuidor             %Imposto");
		 	   tabuada += ("\n"+vlrveic +"             |            "+ (vlrveic*0.05)+"           |                    "+"Isento");
		 	  JOptionPane.showMessageDialog(null, tabuada);
		}else 
			if (vlrveic <= 25000) {
				String tabuada = ("valor do veículo    % do distribuidor              %Imposto");
			 	   tabuada += ("\n"+vlrveic +"             |            "+ (vlrveic*0.10)+"           |                  "+(vlrveic*0.15));
			 	  JOptionPane.showMessageDialog(null, tabuada);
			}else {
				String tabuada = ("valor do veículo    % do distribuidor                %Imposto");
	 	   			tabuada += ("\n"+vlrveic +"               |            "+ (vlrveic*0.15)+"           |                  "+(vlrveic*0.20));
	 	   		JOptionPane.showMessageDialog(null, tabuada);}
			
		 	  

	}

}
