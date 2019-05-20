package exercício11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//perguntando notas ao usuário
				double nota1  = Double.parseDouble(JOptionPane.showInputDialog("Informe o sua nota 1"));
				double nota2  = Double.parseDouble(JOptionPane.showInputDialog("Informe o sua nota 2"));
				double nota3  = Double.parseDouble(JOptionPane.showInputDialog("Informe o sua nota 3"));
				double nota4  = Double.parseDouble(JOptionPane.showInputDialog("Informe o sua nota 4"));
				int    faltas = Integer.parseInt(JOptionPane.showInputDialog("Informe as faltas do aluno:"));
				
				double media = (nota1 + nota2 + nota3 + nota4) / 4;
				
				if((media == 10)&&(faltas < 15)) {
					JOptionPane.showMessageDialog(null,"Parabéns.");}
				else
					if((media >=9)&&(faltas < 15)) {
						JOptionPane.showMessageDialog(null,"Ótimo. " + media);}
					else
						if((media >=8)&&(faltas < 15)) {
							JOptionPane.showMessageDialog(null,"Bom. " + media);}
						else
							if((media >=7)&&(faltas < 15)) {
								JOptionPane.showMessageDialog(null,"Bom. " + media);}
							else
								if((media >=6)&&(faltas < 15)) {
									JOptionPane.showMessageDialog(null,"Em Exame. " + media);}
								else
									if((media > 5)&&(faltas < 15)) {
										JOptionPane.showMessageDialog(null,"Em Exame. " + media);}
									else
										if((media >=4)&&(faltas < 15)) {
											JOptionPane.showMessageDialog(null,"Reprovado. " + media);}
										else
											if((media >=0)&&(faltas < 15)) {
												JOptionPane.showMessageDialog(null,"Reprovado. " + media);}
											else {
												JOptionPane.showMessageDialog(null,"Reprovado por faltas, com média " + media);}
				}
	}
			
		
		
		

	


