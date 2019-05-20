package exercício10;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double investe = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do  investimento:"));
		int meses = 0 ;
		double ganho = 0, total = 0, total2 = 0, porcento = 0.0037;
		String mostra = "";
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		do {
			meses = Integer.parseInt(JOptionPane.showInputDialog("Informe por quantos messes o dinheiro deve ser investido"));
			} while (meses>24);
		
		for (int i = 1; i <=meses ; i++) {
			
			if (i == 1 ) {
			ganho = investe * porcento;
			total = investe + ganho;
			total2 = ganho + total2;
			
			
			
			
			}else{
				ganho = total * porcento;
				total  += ganho;
				total2 = ganho + total2;}
			
				mostra+="\n"+ (meses)+ "- Ganho "+(df.format(ganho))+" Total = "+ (df.format(total));
				
				JOptionPane.showMessageDialog(null, mostra);
			
		}
		JOptionPane.showMessageDialog(null, "Total de ganhos: "+ df.format(total2));

	}

}
