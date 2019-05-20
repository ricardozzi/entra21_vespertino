package exercício26;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome   = JOptionPane.showInputDialog("Nome:");
		int    idade   = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
				
				if (idade <= 4) {
					JOptionPane.showMessageDialog(null,"Bebê -- Nome: "+nome);
				}else 
					if (idade <= 11) {
						JOptionPane.showMessageDialog(null,"Criança -- Nome: "+nome);
					}else
						if (idade <= 14) {
							JOptionPane.showMessageDialog(null,"Adolescente -- Nome: "+nome);
						}else
							if (idade <= 30) {
								JOptionPane.showMessageDialog(null,"Jovem -- Nome: "+nome);
							}else
								if (idade <= 45) {
									JOptionPane.showMessageDialog(null,"Madura -- Nome: "+nome);
								}else 
									if (idade <= 60) {
										JOptionPane.showMessageDialog(null,"Adulto -- Nome: "+nome);
									}else
										if (idade <= 75) {
											JOptionPane.showMessageDialog(null,"Idoso I -- Nome: "+nome);
										}else
											if (idade <= 90) {
												JOptionPane.showMessageDialog(null,"Idoso II -- Nome: "+nome);}
											else
												JOptionPane.showMessageDialog(null,"Idoso III -- Nome: "+nome);

		

	}
}
