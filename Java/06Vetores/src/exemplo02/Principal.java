package exemplo02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// Vetor
		String[] nomes = new String[3];

		// Obter os 3 nomes
		for (int i = 0; i < 3; i++) {
			nomes[i] = JOptionPane.showInputDialog((i + 1) + "� nome");

		}

		// Foreach - Executa cada posi��o do vetor

		for (String elemento : nomes) {
			System.out.println(elemento);

		}
	}

}
