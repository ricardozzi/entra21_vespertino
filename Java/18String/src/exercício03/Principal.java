package exerc�cio03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// Variaveis
		String nome, novonome = "", letrasM = "", fim = "ar", mostra = "";
		int numeroletra, vogal = 0;

		// Pedindo informa��o
		nome = JOptionPane.showInputDialog("Informe uma palavra");

		// contando letras
		numeroletra = nome.length();
		System.out.println(numeroletra);

		//

		String[] nomes = new String[numeroletra];
		if (nome.endsWith(fim)) {
			for (int i = 0; i < numeroletra - 2; i++) {
				nomes[i] = String.valueOf(nome.charAt((i)));
				novonome += nomes[i];
			}

		
		mostra += " A cojuga��o do verbo "+ nome +" �:";
		mostra += "\n Eu " + novonome + "o";
		mostra += "\n Tu " + novonome + "as";
		mostra += "\n Ele " + novonome + "a";
		mostra += "\n N�s " + novonome + "os";
		mostra += "\n V�s " + novonome + "ais";
		mostra += "\n Eles " + novonome + "am";

		JOptionPane.showMessageDialog(null, mostra);}

	}

}
