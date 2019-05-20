package exercício13;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o número para que mostre o antecessor e o sucessor dele:"));
		int ante    = numero1 - 1;
		int suce    = numero1 + 1;
		
		JOptionPane.showMessageDialog(null, ante + "--" + numero1 + "--" + suce);
	}

}
