package exerc�cio17;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double numero1  = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro n�mero"));
		double numero2  = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo n�mero"));
		
		JOptionPane.showMessageDialog(null, (numero1/numero2));

	}

}
