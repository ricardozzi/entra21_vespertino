package exercício28;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número:"));
		JOptionPane.showMessageDialog(null, numero % 2 == 0 ? "Par" : "Ímpar");
		
		if (numero < 0) {
			JOptionPane.showMessageDialog(null, "O número informado é negativo");
		}else
			JOptionPane.showMessageDialog(null, "O número informado é positivo");

	}
}
