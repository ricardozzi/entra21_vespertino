package exerc�cio19;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		double s   = Double.parseDouble(JOptionPane.showInputDialog("Informe o espa�o percorrido:"));
		double t   = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo utilizado par percorrer o espa�o informado:"));

		double result = (s/t);
		JOptionPane.showMessageDialog(null,  result+" m/s");
	
	}

}
