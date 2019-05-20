package exercício24;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double valor1   = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor1:"));
		double valor2   = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor2:"));
		double valor3   = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor3:"));
		
		if ((valor1 < valor2) && (valor1 < valor3) && (valor2 < valor3)) {
			JOptionPane.showMessageDialog(null, valor1+" "+valor2+" "+valor3);
		}else 
			if ((valor1 < valor2) && (valor1 < valor3) && (valor2 > valor3)) {
				JOptionPane.showMessageDialog(null, valor1+" "+valor3+" "+valor2);
			}else 
				if ((valor2 < valor1)&&(valor2 < valor3) && (valor3 < valor1)) {
					JOptionPane.showMessageDialog(null, valor2+" "+valor3+" "+valor1);
				}else 
					if ((valor2 < valor1)&&(valor2 < valor3) && (valor3 > valor1)) {
						JOptionPane.showMessageDialog(null, valor2+" "+valor1+" "+valor3);
					}else
						if ((valor3 < valor2)&&(valor3 < valor1) && (valor2 < valor1)) {
							JOptionPane.showMessageDialog(null, valor3+" "+valor2+" "+valor1);
						}else
								JOptionPane.showMessageDialog(null, valor3+" "+valor1+" "+valor2);}
				

			
		
	}


