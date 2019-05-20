package exercício08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		 
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um  número"));
		int  total = 0;
		String mostra = " ";
		
		for (int i = numero; i > 1; i--) {
			if (i == numero) {
				total = numero * (i-1);
				JOptionPane.showMessageDialog(null, total);
			}else {
				mostra+="\n"+total+" X "+  (i-1)+" = "+ total * (i-1); 
				total  = total * (i-1);
				JOptionPane.showMessageDialog(null, mostra);
			}
			
		
		} 
			
		}


}
