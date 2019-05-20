package exercício02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Variáveis
		int numeros = 0;
		String mostra = "";
		
		//Array
		int[] guarda = new int [10];
		
		//Laços
		for (int i = 0; i < 10; i++) {
			guarda[i] = Integer.parseInt(JOptionPane.showInputDialog("informe o números: "));
		}
//		for (int i1 = 0; i1 < 10; i1++) {
//			int i2 = 10;
//			guarda[i1] = guarda[i2];
//			guarda[i2] = guarda[i1];
//		}	
		mostra+="\n total = "+guarda[9];
		mostra+="\n total = "+guarda[8];
		mostra+="\n total = "+guarda[7];
		mostra+="\n total = "+guarda[6];
		mostra+="\n total = "+guarda[5];
		mostra+="\n total = "+guarda[4];
		mostra+="\n total = "+guarda[3];
		mostra+="\n total = "+guarda[2];
		mostra+="\n total = "+guarda[1];
		mostra+="\n total = "+guarda[0];
		JOptionPane.showMessageDialog(null, mostra);
		
	}

}
