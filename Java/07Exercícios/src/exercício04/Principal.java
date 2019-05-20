package exercício04;

import java.util.Arrays;

import javax.swing.JOptionPane;



public class Principal {

	public static void main(String[] args) {
		
		//Variáveis
		String nome = "", mostra = "";
		int indice = 0, maisacertos = 0;
		boolean valida = false;
		
		//Array
		String[] nomes     = new String [10];
		String[] respostas = new String [10];
		String[] gabarito  = new String [10];
		int[]    acertos   = new int    [10];
		int[]    erros     = new int    [10];
		
		//pedido do gabarito
		for (int i = 0; i < 10; i++) {
		do {
			valida = false;
			gabarito[i] = JOptionPane.showInputDialog("informe a respsta da quetão "+(i+1)+" :");
			if ((gabarito[i].equals("a"))||(gabarito[i].equals("b"))||(gabarito[i].equals("c"))||(gabarito[i].equals("d"))) {
				valida = true;}
		
		} while (valida == false);
		}
		
		//laço
		nome = JOptionPane.showInputDialog("Informe seu nome  ou  sair para finalizar");
		
		while (!nome.equals("sair")) {

			//passar os nomes pro array
			nomes[indice] = nome;
			
			//respostas dos alunos
			for (int i = 0; i < 10; i++) {
				do {
					valida = false;
					respostas[i] = JOptionPane.showInputDialog((i + 1) + "ª respsta");
					if ((respostas[i].equals("a")) || (respostas[i].equals("b")) || (respostas[i].equals("c"))|| (respostas[i].equals("d"))) {
						valida = true;
					}

				} while (valida == false);
			}
		
			//Contagem
			for (int i = 0; i < 10; i++) {
				if(gabarito[i].equals(respostas[i])) {
					acertos[indice]++;
				}else {
					erros[indice]++;}
				}
		
			//Mostrando dados
			for (int i = 0; i < 10; i++) {
				if(nomes[i] != null) {
					JOptionPane.showMessageDialog(null, "nome: "+nomes[i]+" acertos: "+acertos[i]+" erros: "+erros[i]);
				}
			}
			
		//Icrementar indice
		indice++;
		
		
		
		//nome
		nome = JOptionPane.showInputDialog("Informe seu nome ou sair para finalizar");
	
		
		}
		
		//Blubble Sort - Método da bolha
				
				for (int i1 = 0; i1 < 4; i1++) {
					
					for (int i2 = i1+1; i2 < 5; i2++) {
						
						if (acertos [i2] > acertos [i1]) {
							//bolha pra acertos
							maisacertos = acertos [i1];
							acertos[i1] = acertos [i2];
							acertos[i2] = maisacertos;
							
							//bolha pra nomes
							String maisnomes = nomes [i1];
							nomes[i1] = nomes [i2];
							nomes[i2] = maisnomes;
							
						}
					}
				}

		
	//Mostrando dados
		for (int i = 0; i < 10; i++) {
			mostra+="\n"+acertos[i]+" acertos - "+nomes[i];
			}
		JOptionPane.showMessageDialog(null, mostra);
	}
}


