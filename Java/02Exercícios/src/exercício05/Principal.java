package exercício05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int data = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia do mês de fevereiro de 2018:"));
		
		if ((data > 28) || (data < 1)) {
			JOptionPane.showMessageDialog(null, "Data inválida");
		}else {
			if ((data == 3) ||(data == 4)) {
				JOptionPane.showMessageDialog(null, "Final de semana");
			}else 
				{if ((data == 10) ||(data == 11)) {
					JOptionPane.showMessageDialog(null, "Final de semana");
				}else 
					{if ((data == 17) ||(data == 18)) {
						JOptionPane.showMessageDialog(null, "Final de semana");
					}else 
						{if ((data == 24) ||(data == 25)) {
							JOptionPane.showMessageDialog(null, "Final de semana");
						}else { 
							JOptionPane.showMessageDialog(null, "Dia de semana");
						}}}}
		}
		
		
	}

}
