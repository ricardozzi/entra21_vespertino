package exerc�cio06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		double numero1  = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro n�mero"));
		double numero2  = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo n�mero"));
		
		if (numero1 == numero2) {
			JOptionPane.showMessageDialog(null, "a soma dos n�meros informados � " + (numero1+numero2));
		}else {
			JOptionPane.showMessageDialog(null, "a multiplica��odos n�meros informados � " + numero1*numero2);
		}
	}

}
