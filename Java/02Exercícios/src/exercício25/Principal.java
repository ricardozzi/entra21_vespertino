package exercício25;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		

		int hora  = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora: "));
		
		if (hora <= 6) {
			JOptionPane.showMessageDialog(null,"Boa Madrugada");
		}else 
			if (hora <= 11) {
				JOptionPane.showMessageDialog(null,"Bom Dia");
			}else
				if (hora <= 18) {
					JOptionPane.showMessageDialog(null,"Boa Tarde");
				}else
					if (hora <= 23) {
						JOptionPane.showMessageDialog(null,"Boa Noite");
					}

	}

}
