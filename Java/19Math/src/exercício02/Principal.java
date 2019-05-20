package exercício02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Variáveis
		int lMin = 0;
		int lMax = 100;
		int palpite = 1;
		int pede;
		
		//Gerar random (Gerador ALetatório)
		double gAl = Math.random();
		
		//atribuir número entre 0 e 100
		int numero = (int)Math.round(lMin+ gAl *lMax);
		
		
		
		//Conta os papiltes e auxilia
		do {
			//pergunta
			pede = Integer.parseInt(JOptionPane.showInputDialog("Tente adivinhar o número que setou pensando de 0 à 100"));
			
			if ((pede <= numero + 10)&&(pede >= numero - 10)) {
				JOptionPane.showMessageDialog(null, "Está bem perto");
			}else {
				if ((pede <= numero + 20)&&(pede >= numero - 20)) {
					JOptionPane.showMessageDialog(null, "Está longe");}
				else {JOptionPane.showMessageDialog(null, "Está muito longe");}
				}
		palpite++;
		
		} while (pede != numero);
		if (palpite == 2) {
			JOptionPane.showMessageDialog(null, "Nossa! Acertou na mosca"+" a resposta é "+numero);
		}else if (palpite <= 5) {
			JOptionPane.showMessageDialog(null, "Parabéns! Você é bom de adivinhação"+" a resposta é "+numero);
		}else if (palpite <= 10) {
			JOptionPane.showMessageDialog(null, "Muito bom. Continue assim"+" a resposta é "+numero);
		}else if (palpite <= 20) {
			JOptionPane.showMessageDialog(null, "Mm... Podia ser melhor. Continue tentando"+"a resposta é "+numero);
		}else if (palpite > 20) {
			JOptionPane.showMessageDialog(null, "Meio lerdo você, hein?"+" a resposta é "+numero);
		}
		
	
		
		//exibir
		System.out.println(numero);

	}

}
