package exerc�cio21;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String produto = ("informe o estado desejado: ");
			produto += ("\n 1 - Cal�a");
			produto += ("\n 2 - Camisa");
			produto += ("\n 3 - Casaco");
			produto += ("\n 4 - Meias");
			produto += ("\n 5 - Palet�s");
	  	   	   
	  	int codprod  = Integer.parseInt(JOptionPane.showInputDialog(produto));
	  	
	  	String forma = ("informe o estado desejado: ");
		  	forma += ("\n 1 - � vista");
		  	forma += ("\n 2 - a prazo 30 dias");
		  	forma += ("\n 3 - a prazo 60 dias");
		  	
		int formapag  = Integer.parseInt(JOptionPane.showInputDialog(forma));
	  	
	  	
	  	if ((codprod == 1)&&(formapag==1)) {
	  		JOptionPane.showMessageDialog(null,"cal�a"+"\nR$150");
		}else 
			if ((codprod == 1)&&(formapag==2)) {
		 		JOptionPane.showMessageDialog(null,"cal�a"+"\nR$165");
			}else 
				if ((codprod== 1)&&(formapag==3)) {
			 		JOptionPane.showMessageDialog(null,"cal�a"+"\nR$180");
				}else 
					if ((codprod == 2)&&(formapag==1)) { 
				 		JOptionPane.showMessageDialog(null,"camisa"+"\nR$300");}
					else			 		
				 		if ((codprod == 2)&&(formapag==2)) {
					  		JOptionPane.showMessageDialog(null,"camisa"+"\nR$330");
						}else 
							if ((codprod == 2)&&(formapag==3)) {
						 		JOptionPane.showMessageDialog(null,"camisa"+"\nR$360");
							}else 
								if ((codprod== 3)&&(formapag==1)) {
							 		JOptionPane.showMessageDialog(null,"casaco"+"\nR$250");}
								else
							 		if ((codprod == 3)&&(formapag==2)) {
								  		JOptionPane.showMessageDialog(null,"casaco"+"\nR$275");
									}else 
										if ((codprod == 3)&&(formapag==3)) {
									 		JOptionPane.showMessageDialog(null,"casaco"+"\nR$300");
										}else 
											if ((codprod== 4)&&(formapag==1)) {
										 		JOptionPane.showMessageDialog(null,"meias"+"\nR$30");}
											else
										 		if ((codprod == 4)&&(formapag==2)) {
											  		JOptionPane.showMessageDialog(null,"meias"+"\nR$33");
												}else 
													if ((codprod == 4)&&(formapag==3)) {
												 		JOptionPane.showMessageDialog(null,"meias"+"\nR$36");
													}else 
														if ((codprod== 5)&&(formapag==1)) {
													 		JOptionPane.showMessageDialog(null,"palet�"+"\nR$450");}
														else
													 		if ((codprod == 5)&&(formapag==2)) {
														  		JOptionPane.showMessageDialog(null,"palet�"+"\nR$495");
															}else 
																if ((codprod == 5)&&(formapag==3)) {
															 		JOptionPane.showMessageDialog(null,"palet�"+"\nR$540");
																}
				
					
	  	
	}

}
