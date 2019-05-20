package exercício02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// Variaveis
		String nome, novonome = "", letrasM = "";
		int numeroletra, vogal = 0;

		// Pedindo informação
		nome = JOptionPane.showInputDialog("Informe uma palavra");

		// contando letras
		numeroletra = nome.length();
		System.out.println(numeroletra);

		//

		String[] nomes = new String[numeroletra];
		for (int i = 0; i < numeroletra; i++) {
			nomes[i] = String.valueOf(nome.charAt((i)));
			if (nomes[i].equals("a")||nomes[i].equals("e")||nomes[i].equals("i")||nomes[i].equals("o")||nomes[i].equals("u")) {
				vogal++;
			} 

		}
		JOptionPane.showMessageDialog(null, vogal);

	}

}
