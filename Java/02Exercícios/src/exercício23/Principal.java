package exercício23;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double peso   = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso da pessoa:"));
		double altura   = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura da pessoa:"));
		
		double result = peso/(Math.pow(altura,2));
		
		if (result<17) {
			JOptionPane.showMessageDialog(null," muito abaixo do peso.");
		}else
			if (result<=18.49) {
				JOptionPane.showMessageDialog(null," abaixo do peso.");
			}else
				if (result<24.99) {
					JOptionPane.showMessageDialog(null," Pessoa normal.");
				}else
					if (result<=29.99) {
						JOptionPane.showMessageDialog(null," Acima do peso.");
					}else
						if (result<34.99) {
							JOptionPane.showMessageDialog(null," ObesidadeI.");
						}else
							if (result<=39.99) {
								JOptionPane.showMessageDialog(null," ObesidadeII (Severa).");
							}else
								JOptionPane.showMessageDialog(null," ObesidadeIII (Mórbida).");
									
								
	}

}
