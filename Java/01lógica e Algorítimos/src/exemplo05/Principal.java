package exemplo05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Vari�veis
		String nome1 = JOptionPane.showInputDialog("Nome 1");
		String nome2 = JOptionPane.showInputDialog("Nome 2");
		
		//Comparar varr�vris do tipo String
		System.out.println(nome1.equals(nome2));

	}

}
