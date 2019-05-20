package exercício06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Object[] sexos = {"Masculino","Femenino"};
		String nome = "";
		int sexo = 0, contador = 0, parabens = 0, otimo = 0, bom = 0, satisfatorio = 0, recuperacao = 0, reprovado = 0, femenino = 0, masculino = 0;
		double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
		do {

			nome = JOptionPane.showInputDialog("Informe seu nome");
			
			if(!nome.equals("sair")) {
			sexo = JOptionPane.showOptionDialog(null,"Informe o sexo:","",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,sexos,0);
			
			//Contabilizar os sexos
			switch(sexo) {
			case 0:
				femenino++;
			break;
			case 1:
				masculino++;
			break;}
			
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua primeira nota:"));
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua segunda nota:"));
			nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua terceira nota:"));
			nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua quarta nota:"));
			
			double media = (nota1 + nota2 + nota3 + nota4) / 4;
			
			if((media == 10)) {
				JOptionPane.showMessageDialog(null,"Parabéns.");
				parabens++;}
			else
				if((media >=9)) {
					JOptionPane.showMessageDialog(null,"Ótimo. " + media);
					otimo++;}
				else
					if((media >=8)) {
						JOptionPane.showMessageDialog(null,"Bom. " + media);
						bom++;}
					else
						if((media >=7)) {
							JOptionPane.showMessageDialog(null,"Satisfatório. " + media);
							satisfatorio++;}
							else
								if((media >= 5)) {
									JOptionPane.showMessageDialog(null,"Recuperação. " + media);
									recuperacao++;}
								else
									if((media <5)) {
										JOptionPane.showMessageDialog(null,"Reprovado. " + media);
										reprovado++;}
									else {
										JOptionPane.showMessageDialog(null,"Reprovado ");
										reprovado++;}

		contador++;	
			}
			
		} while (!nome.equals("sair"));
		
		//Exibir o resultado
		
				String resultado ="Quantidade e percentual de:";
					   resultado+="\nMulheres: "+femenino+" -- "+(femenino*100)/2 + " %" ;
					   resultado+="\nHomens: "+masculino+" -- "+(masculino*100)/2 + " %" ;
					   resultado+="\nQuantidade e percentual de alunos com média:" ;
					   resultado+="\n10: "+parabens+"--"+(parabens*100)/contador + " %" ;
					   resultado+="\n9.0 á 9.9: "+otimo+"--"+(otimo*100)/contador + " %" ;
					   resultado+="\n8.0 á 8.9: "+bom+"--"+(bom*100)/contador + " %" ;
					   resultado+="\n7.0 á 7.9: "+satisfatorio+"--"+(satisfatorio*100)/contador + " %" ;
					   resultado+="\n5.0 á 6.9: "+recuperacao+"--"+(recuperacao*100)/contador + " %" ;
					   resultado+="\nabaixo de 5: "+reprovado+"--"+(reprovado*100)/contador + " %" ;
			
					   JOptionPane.showMessageDialog(null, resultado);

	}

}
