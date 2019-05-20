package exercício03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String mostra = "";
		//verifica se tem 10
		boolean existe10 = false;
		
		//obter os numeros
		int[] guarda = new int [5];
		
		//Laços
		for (int i = 0; i < 4; i++) {
			guarda[i] = Integer.parseInt(JOptionPane.showInputDialog("informe os números: "+(i+1)));
			if (guarda[1] == 10) {
				existe10 = true;
			}
			
		}
		if (existe10 = false) {
			JOptionPane.showMessageDialog(null, "Não tem número 10");
		}else
			JOptionPane.showMessageDialog(null, " tem número 10");
			for (int i = 0; i < 5; i++) {
				if (guarda[i] ==10) {
					mostra+="\n Tem numero 10 nas posições:"+(i+1);
				}
			}
			JOptionPane.showMessageDialog(null, mostra);
		
	}

}
