package exercício05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String produto = JOptionPane.showInputDialog("Informe o produto");
		double valor   = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
		double  desconto  = 0.05, quant=1;
		String resultado =" "; 
			
			resultado+= "Produto: "+produto+"\n Valor: R$"+ valor;
		for (int indice = 1; indice <=10 ; indice++) {
			
			resultado+="\n"+quant+" X R$"+(valor-(valor*desconto))+" = R$"+quant*(valor-(valor*desconto));
			desconto+=0.05;
			quant++;
			
		}
		JOptionPane.showMessageDialog(null, resultado);

	}
}
