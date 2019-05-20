package exercício02;

import javax.swing.JOptionPane;



public class Principal {

	public static void main(String[] args) {
		
		//perguntando ao usuário
		double valor  = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da Compra"));
		JOptionPane.showMessageDialog(null,"Desconto de 10%, total R$ " + valor * 0.9);
		
		
		
	}

}
