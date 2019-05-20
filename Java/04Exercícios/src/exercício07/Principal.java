package exercício07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int contador = 0;
		String letra = "", letras = " ";

		JOptionPane.showMessageDialog(null,"Este é um jogo de forca você tem 7 chances 1 chance para cada letra \n Dica : escola");
		do {
			
			letra = JOptionPane.showInputDialog("Informe seu palpite");
			
			if (letra.equals("e")) {
				letras += "e";
				contador++;
				JOptionPane.showMessageDialog(null, letras + " certa");
			}else
				if (letra.equals("s")) {
					letras += "s";
					contador++;
					JOptionPane.showMessageDialog(null, letras+ " certa");
				}else
					if (letra.equals("t")) {
						letras += "t";
						contador++;
						JOptionPane.showMessageDialog(null, letras+ " certa");
					}else
						if (letra.equals("u")) {
							letras += "u";
							contador++;
							JOptionPane.showMessageDialog(null, letras+ " certa");
						}else
							if (letra.equals("d")) {
								letras += "d";
								contador++;
								JOptionPane.showMessageDialog(null, letras+ " certa");
							}else
								if (letra.equals("a")) {
									letras += "a";
									contador++;
									JOptionPane.showMessageDialog(null, letras+ " certa");
								}else
									if (letra.equals("r")) {
										letras += "r";
										contador++;
										JOptionPane.showMessageDialog(null, letras+ " palavra correta");
									}else
										JOptionPane.showMessageDialog(null, "A letra digitada nao corresponde a palavra!");
		
							
		} while (contador<7);

	}

}
