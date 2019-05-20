package exercício30;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double ganho     = Double.parseDouble(JOptionPane.showInputDialog("Informe o ganho por hora:"));
		int    hnormal   = Integer.parseInt(JOptionPane.showInputDialog("Informe as horas trabalhadas normalmente:"));
		int    hacres    = Integer.parseInt(JOptionPane.showInputDialog("quantidades de horas extras:"));
		double ganhohn   = ganho * hnormal;
		double ganhoha   = ganho * hacres * 2;
		
		JOptionPane.showMessageDialog(null, "Salário Bruto: "+(ganhohn+ganhoha));
		
			
		}
	

}
