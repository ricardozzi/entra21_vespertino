package exerc�cio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Vari�veis
		int lMin = 0;
		int lMax = 100;
		int palpite = 1;
		int pede;
		
		//Gerar random (Gerador ALetat�rio)
		double gAl = Math.random();
		
		//atribuir n�mero entre 0 e 100
		int numero = (int)Math.round(lMin+ gAl *lMax);
		
		
		
		//Conta os papiltes e auxilia
		do {
			//pergunta
			pede = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar o n�mero que setou pensando de 0 � 100"));
			
			if ((pede <= numero + 10)&&(pede >= numero - 10)) {
				JOptionPane.showMessageDialog(null, "Est� bem perto");
			}else {
				if ((pede <= numero + 20)&&(pede >= numero - 20)) {
					JOptionPane.showMessageDialog(null, "Est� longe");}
				else {JOptionPane.showMessageDialog(null, "Est� muito longe");}
				}
		palpite++;
		
		} while (pede != numero);
		if (palpite == 2) {
			JOptionPane.showMessageDialog(null, "Nossa! Acertou na mosca"+" a resposta � "+numero);
		}else if (palpite <= 5) {
			JOptionPane.showMessageDialog(null, "Parab�ns! Voc� � bom de adivinha��o"+" a resposta � "+numero);
		}else if (palpite <= 10) {
			JOptionPane.showMessageDialog(null, "Muito bom. Continue assim"+" a resposta � "+numero);
		}else if (palpite <= 20) {
			JOptionPane.showMessageDialog(null, "Mm... Podia ser melhor. Continue tentando"+"a resposta � "+numero);
		}else if (palpite > 20) {
			JOptionPane.showMessageDialog(null, "Meio lerdo voc�, hein?"+" a resposta � "+numero);
		}
		
	
		
		//exibir
		System.out.println(numero);

	}

}
