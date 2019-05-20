package exercício04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		
		String produto  = JOptionPane.showInputDialog("Informe o produto:");
		double valor    = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
		int tipoPag  = JOptionPane.showConfirmDialog(null, "Pagamento à vista?"," ",JOptionPane.YES_NO_OPTION );
		
		
		if((tipoPag == 0) && (valor > 500))  {
			JOptionPane.showMessageDialog(null,"O Produto "+ produto +" custará R$ " + valor * 0.9);
		}else {
			JOptionPane.showMessageDialog(null,"O Produto "+ produto +" custará R$ " + valor);}
		
		
		
		
		
		
		

	}

}
