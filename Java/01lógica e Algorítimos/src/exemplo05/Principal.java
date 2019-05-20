package exemplo05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Variáveis
		String nome1 = JOptionPane.showInputDialog("Nome 1");
		String nome2 = JOptionPane.showInputDialog("Nome 2");
		
		//Comparar varrávris do tipo String
		System.out.println(nome1.equals(nome2));

	}

}
