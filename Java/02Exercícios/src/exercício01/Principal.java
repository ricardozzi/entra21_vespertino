package exerc�cio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//pegando os dados
		String nome   = JOptionPane.showInputDialog("Nome:");
		int    idade  = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
		String cidade = JOptionPane.showInputDialog("Onde voc� mora:");
		
		//retornando informa��es
		
		JOptionPane.showMessageDialog(null,"A" + nome + " tem " + idade + " anos de idade e mora em " + cidade);

	}

}
