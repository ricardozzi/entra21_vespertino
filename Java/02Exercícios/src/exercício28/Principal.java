package exerc�cio28;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero:"));
		JOptionPane.showMessageDialog(null, numero % 2 == 0 ? "Par" : "�mpar");
		
		if (numero < 0) {
			JOptionPane.showMessageDialog(null, "O n�mero informado � negativo");
		}else
			JOptionPane.showMessageDialog(null, "O n�mero informado � positivo");

	}
}
