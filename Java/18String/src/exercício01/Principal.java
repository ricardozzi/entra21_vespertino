package exercício01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Variaveis
		String nome, novonome = "", letrasM = "";
		int numeroletra;
		
		//Pedindo informação
		nome =JOptionPane.showInputDialog("Informe uma palavra");
		
		//contando letras
		numeroletra = nome.length();
		System.out.println(numeroletra);
		
		//
		
		String[] nomes = new String[numeroletra];
		for (int i = 0; i < numeroletra; i++) {
			nomes[i] = String.valueOf(nome.charAt((i)));
			if (i % 2 == 0) {
				novonome +=nomes[i].toUpperCase();
			}else
				novonome +=nomes[i].toLowerCase();
			
			
		}
		JOptionPane.showMessageDialog(null, novonome);
		
			
	
		
	

	}

}
