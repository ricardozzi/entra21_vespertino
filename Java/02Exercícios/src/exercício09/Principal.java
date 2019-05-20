package exercício09;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int valor1  = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 1 "));
		int valor2  = Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor 2 "));
		int valor3  = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 3 "));
		
		if ((valor1 < valor2) && (valor1 < valor3)) {
			JOptionPane.showMessageDialog(null, valor1+" é o menor valor informado.");
		}else {
			if ((valor2 < valor1)&&(valor2 < valor3)) {
				JOptionPane.showMessageDialog(null, valor2+" é o menor valor informado.");
			}else {
				if ((valor3 < valor1)&&(valor3 < valor2)) {
					JOptionPane.showMessageDialog(null, valor3 +" é o menor valor informado.");
				}else {
					JOptionPane.showMessageDialog(null,"Os valores "+valor1+","+valor2+","+valor3+" são iguais.");
				}
			}
			
		}
			
	}
		
}


