package Exercício03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//perguntando notas ao usuário
		double nota1  = Double.parseDouble(JOptionPane.showInputDialog("Informe o sua nota 1"));
		double nota2  = Double.parseDouble(JOptionPane.showInputDialog("Informe o sua nota 2"));
		double nota3  = Double.parseDouble(JOptionPane.showInputDialog("Informe o sua nota 3"));
		double nota4  = Double.parseDouble(JOptionPane.showInputDialog("Informe o sua nota 4"));
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media == 10) {
			JOptionPane.showMessageDialog(null,"Aprovado.");}
		else
			if(media >=9) {
				JOptionPane.showMessageDialog(null,"Aprovado. " + media);}
			else
				if(media >=8) {
					JOptionPane.showMessageDialog(null,"Aprovado. " + media);}
				else
					if(media >=7) {
						JOptionPane.showMessageDialog(null,"Aprovado. " + media);}
					else
						if(media >=6) {
							JOptionPane.showMessageDialog(null,"Em Exame. " + media);}
						else
							if(media >= 5) {
								JOptionPane.showMessageDialog(null,"Em Exame. " + media);}
							else
								if(media >=4) {
									JOptionPane.showMessageDialog(null,"Reprovado. " + media);}
								else
									JOptionPane.showMessageDialog(null,"Reprovado. " + media);}
	


}


