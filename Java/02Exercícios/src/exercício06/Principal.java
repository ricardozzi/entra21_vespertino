package exercício06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		double numero1  = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
		double numero2  = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));
		
		if (numero1 == numero2) {
			JOptionPane.showMessageDialog(null, "a soma dos números informados é " + (numero1+numero2));
		}else {
			JOptionPane.showMessageDialog(null, "a multiplicaçãodos números informados é " + numero1*numero2);
		}
	}

}
