package exercício10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int qmoeda1  = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de R$ 0,01"));
		int qmoeda5  = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de R$ 0,05"));
		int qmoeda10 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de R$ 0,10"));
		int qmoeda25 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de R$ 0,25"));
		int qmoeda50 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de R$ 0,50"));
		int qmoeda1R = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de R$ 1,00"));
		
		String tabuada = ("Número informado: ");
		   tabuada += ("\n" +" Moeda    "  + "Quantidade");	
	 	   tabuada += ("\n" +" R$ 0,01    " + qmoeda1);
	 	   tabuada += ("\n" +" R$ 0,05    " + qmoeda1);
	 	   tabuada += ("\n" +" R$ 0,10    " + qmoeda1);
	 	   tabuada += ("\n" +" R$ 0,25    " + qmoeda1);
	 	   tabuada += ("\n" +" R$ 0,50    " + qmoeda1);
	 	   tabuada += ("\n" +" R$ 1,00    " + qmoeda1);
	 	   
	 	  JOptionPane.showMessageDialog(null, tabuada);
//		String Soma = ("Número informado: ");	
//			Soma += ("\n" +" R$ 0,01    " + qmoeda1);
//			Soma += ("\n" +" R$ 0,05    " + qmoeda1);
//			Soma += ("\n" +" R$ 0,10    " + qmoeda1);
//			Soma += ("\n" +" R$ 0,25    " + qmoeda1);
//			Soma += ("\n" +" R$ 0,50    " + qmoeda1);
//			Soma += ("\n" +" R$ 1,00    " + qmoeda1);
	 	  
	 	  double valor1  = (qmoeda1 * 0.01);
	 	  double valor2  = (qmoeda1 * 0.05);
	 	  double valor3  = (qmoeda1 * 0.10);
	 	  double valor4  = (qmoeda1 * 0.25);
	 	  double valor5  = (qmoeda1 * 0.50);
	 	  double valor6  = (qmoeda1 * 1.00);
	 	  
	 	 JOptionPane.showMessageDialog(null, valor1 + valor2 + valor3 + valor4 + valor5 + valor6);
	 	
	 	
	 	   
	 	  
	}

}
