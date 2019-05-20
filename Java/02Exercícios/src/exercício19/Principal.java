package exercício19;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		double s   = Double.parseDouble(JOptionPane.showInputDialog("Informe o espaço percorrido:"));
		double t   = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo utilizado par percorrer o espaço informado:"));

		double result = (s/t);
		JOptionPane.showMessageDialog(null,  result+" m/s");
	
	}

}
