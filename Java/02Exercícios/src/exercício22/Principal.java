package exercício22;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int valor1  = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 1 "));
		int valor2  = Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor 2 "));
		int valor3  = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 3 "));
		int valor4  = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 4 "));
		
		if ((valor1 < valor2) || (valor1 < valor3)||(valor4 < valor3)) {
			JOptionPane.showMessageDialog(null," O objeto analisado não é um quadrado.");
		}else {
			if ((valor2 < valor1)||(valor2 < valor3)||(valor4 < valor3)) {
				JOptionPane.showMessageDialog(null," O objeto analisado não é um quadrado.");
			}else {
				if ((valor3 < valor1)||(valor3 < valor2)||(valor4 < valor3)) {
					JOptionPane.showMessageDialog(null," O objeto analisado não é um quadrado.");
				}else {
					if ((valor4 < valor1)||(valor4 < valor2)||(valor4 < valor3)) {
						JOptionPane.showMessageDialog(null,"O objeto analisado não é um quadrado");
					}else {
						JOptionPane.showMessageDialog(null,"O objeto analisado é um quadrado");
					}
				}
			}
			
		}
			
	}

}
