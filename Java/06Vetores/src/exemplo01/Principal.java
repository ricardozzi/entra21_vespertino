package exemplo01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Vetor ou Array = vari�vel que eng�oba v�rios dados
		String[] nomes = new String[3];
		
		//obter os 3 nomes
		nomes[0] = JOptionPane.showInputDialog("1 nome");
		nomes[1] = JOptionPane.showInputDialog("2 nome");
		nomes[2] = JOptionPane.showInputDialog("3 nome");
		
		//Exibir os 3 nomes
		JOptionPane.showMessageDialog(null, nomes[0]);
		JOptionPane.showMessageDialog(null, nomes[1]);
		JOptionPane.showMessageDialog(null, nomes[2]);
	}

}
