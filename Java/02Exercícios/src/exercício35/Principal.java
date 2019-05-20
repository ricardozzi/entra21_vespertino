package exercício35;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome      = JOptionPane.showInputDialog("Nome:");
		int    faltas    = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de faltas: "));
		double vlsalbr  = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do salário bruto:"));
		
		double vlrsvale    = vlsalbr * 0.94;

		if (vlrsvale <= 937) {
			JOptionPane.showMessageDialog(null,"Isento");
		}else
			if (vlrsvale<=1999.99) {
				JOptionPane.showMessageDialog(null,vlrsvale*0.95);
			}else
				if (vlrsvale <= 93) {
					JOptionPane.showMessageDialog(null,"Isento");
				}else
					if (vlrsvale<=1999) {
						JOptionPane.showMessageDialog(null,vlrsvale*0.95);
					}else
						if (vlrsvale <= 937) {
							JOptionPane.showMessageDialog(null,"Isento");
						}else
							if (vlrsvale<=1999) {
								JOptionPane.showMessageDialog(null,vlrsvale*0.95);
							}else {}
		
			
		
	}

}
