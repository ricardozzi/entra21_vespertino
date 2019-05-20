package exercício12;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int vlcarro = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade do carro:"));
		int vlpista = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade permitida na referente pista:"));
		int resto   = vlcarro - vlpista;
		
		if (resto <= 0) {
			JOptionPane.showMessageDialog(null,"Bom motorrista");
		}else
			if (resto <= 10) {
				JOptionPane.showMessageDialog(null,"multa de R$50");
			}else
				if (resto <= 30) {
					JOptionPane.showMessageDialog(null,"multa de R$100");
				}else
					JOptionPane.showMessageDialog(null,"multa de R$200");
		
	}

	}
