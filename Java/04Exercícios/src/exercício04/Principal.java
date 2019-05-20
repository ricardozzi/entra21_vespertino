package exercício04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
Object[] opcoes = {"Excelente","Ótimo","Bom","Regular","Ruim"};
		
		//Variáveis
		int excelente=0, otimo=0, bom=0, regular=0, ruim = 0;
		int opicao, continuar = 0, contador = 0, idade = 0, continuar2 = 0, contador1 = 0, contador2 = 0, contador3 = 0;
		
		//Laço
		do {
		do {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
			if ((idade<=0)||(idade>100)) {
				continuar = 0;
			}else
				continuar2 = 1;
			if (idade<=9) {
				contador1++;	
			}else
				if (idade<17) {
					contador2++;
				}else
					contador3++;
	
		} while (continuar2 ==0);
		
		
			
			//Selecionar opções
			opicao = JOptionPane.showOptionDialog(null,"O que você achou do filme Alice no País das Maravilhas","",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,opcoes,0);
			
			//Contabilizar os votos
			switch(opicao) {
			case 0:
				excelente++;
			break;
			case 1:
				otimo++;
			break;
			case 2:
				bom++;
			break;
			case 3:
				regular++;
			break;
			case 4:
				ruim++;
			break;
			}
			
			//verificar se deseja continuar
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			contador++;
		}while(continuar ==0);
		
		//Exibir o resultado
		
		String resultado ="Votação de cores:";
			   resultado+="\nVermelho obteve: "+(excelente*100)/contador + " %" ;
			   resultado+="\naAzul obteve: "+(otimo*100)/contador + " %" ;
			   resultado+="\nRosa obteve: "+(bom*100)/contador + " %" ;
			   resultado+="\nAmarelo obteve: "+(regular*100)/contador + " %" ;
			   resultado+="\nVerde obteve: "+(ruim*100)/contador + " %" ;
			   resultado+="\nQuantidade de crianças: "+ contador1 ;
			   resultado+="\nQuantidade de Adolescente: "+contador2 ;
			   resultado+="\nQuantidade de Adultos: "+contador3 ;
	
			   JOptionPane.showMessageDialog(null, resultado);

	}

}
