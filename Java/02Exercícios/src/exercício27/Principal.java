package exerc�cio27;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));
		JOptionPane.showMessageDialog(null, ano % 4 == 0 ? "Ano Bissexto" : "N�o � Ano Bissexto");

	}

}
