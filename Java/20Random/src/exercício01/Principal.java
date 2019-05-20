package exercício01;

import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		String mostra = "", a, b, c, d;
		int acerto = 0, erro = 0;

		// Array
		int[] numeros = new int[10];
		String[] respUsu = new String[16];
		String[] respSis = new String[16];
		String[][] nome = new String[16][16];

		// Random
		Random gerar = new Random();

		// adicionado dados ao vetor
		int i = 0;
		while (i < numeros.length) {
			numeros[i] = gerar.nextInt(15);
			boolean existe = false;
			for (int j = 0; j < i; j++) {
				if (numeros[i] == numeros[j]) {
					existe = true;
					break;
				}

			}
			if (!existe) {
				i++;
			}
		}

		// Matriz
		String[][] perg = new String[5][15];

		// pergunta 1
		perg[0][0] = "1) ";
		// respostas 1
		perg[1][0] = "a*";
		perg[2][0] = "a";
		perg[3][0] = "a";
		perg[4][0] = "a";

		// pergunta 2
		perg[0][1] = "2";
		// respostas 2
		perg[1][1] = "a";
		perg[2][1] = "b*";
		perg[3][1] = "a";
		perg[4][1] = "a";

		// pergunta 3
		perg[0][2] = "3";
		// respostas 3
		perg[1][2] = "a";
		perg[2][2] = "b*";
		perg[3][2] = "a";
		perg[4][2] = "a";

		// pergunta 4
		perg[0][3] = "4";
		// respostas 4
		perg[1][3] = "a";
		perg[2][3] = "a";
		perg[3][3] = "c*";
		perg[4][3] = "a";

		// pergunta 5
		perg[0][4] = "5";
		// respostas 5
		perg[1][4] = "a";
		perg[2][4] = "b";
		perg[3][4] = "c*";
		perg[4][4] = "a";

		// pergunta 6
		perg[0][5] = "6";
		// respostas 6
		perg[1][5] = "a";
		perg[2][5] = "b";
		perg[3][5] = "a";
		perg[4][5] = "d*";

		// pergunta 7
		perg[0][6] = "7";
		// respostas 7
		perg[1][6] = "a";
		perg[2][6] = "b";
		perg[3][6] = "a";
		perg[4][6] = "d*";

		// pergunta 8
		perg[0][7] = "8";
		// respostas 8
		perg[1][7] = "a*";
		perg[2][7] = "b";
		perg[3][7] = "a";
		perg[4][7] = "b";

		// pergunta 9
		perg[0][8] = "9";
		// respostas 9
		perg[1][8] = "a*";
		perg[2][8] = "b";
		perg[3][8] = "a";
		perg[4][8] = "b";

		// pergunta 10
		perg[0][9] = "10";
		// respostas 10
		perg[1][9] = "a";
		perg[2][9] = "b*";
		perg[3][9] = "a";
		perg[4][9] = "b";

		// pergunta 11
		perg[0][10] = "11";
		// respostas 11
		perg[1][10] = "a*";
		perg[2][10] = "b";
		perg[3][10] = "a";
		perg[4][10] = "b";

		// pergunta 12
		perg[0][11] = "12";
		// respostas 12
		perg[1][11] = "a";
		perg[2][11] = "b";
		perg[3][11] = "c*";
		perg[4][11] = "b";

		// pergunta 13
		perg[0][12] = "13)";
		// respostas 13
		perg[1][12] = "a*";
		perg[2][12] = "b";
		perg[3][12] = "a";
		perg[4][12] = "b";

		// pergunta 14
		perg[0][13] = "14)Para que a galinha atravessou a estrada";
		// respostas 14
		perg[1][13] = "a) chegar do outro lado*";
		perg[2][13] = "b";
		perg[3][13] = "a";
		perg[4][13] = "b";

		// pergunta 15
		perg[0][14] = "15) Quanto é 1+1?";
		// respostas 15
		perg[1][14] = "a) 2*";
		perg[2][14] = "b) 3";
		perg[3][14] = "c) 8";
		perg[4][14] = "d) 4";
		
		//respostas certas do sistema
		respSis[0] = "a";
		respSis[1] = "b";
		respSis[2] = "b";
		respSis[3] = "c";
		respSis[4] = "c";
		respSis[5] = "d";
		respSis[6] = "d";
		respSis[7] = "a";
		respSis[8] = "a";
		respSis[9] = "b";
		respSis[10] = "a";
		respSis[11] = "c";
		respSis[12] = "a";
		respSis[13] = "a";
		respSis[14] = "a";
		
		//cadastro
		
		

		// exibir dados
		for (int valor : numeros) {
			do {

				mostra = "\n pergunta 1: " + (perg[0][valor] + " ");
				a = perg[1][valor];
				b = perg[2][valor];
				c = perg[3][valor];
				d = perg[4][valor];

				respUsu[valor] = JOptionPane.showInputDialog(mostra + "\n" + a + "\n" + b + "\n" + c + "\n" + d);
				
				

			} while ((!respUsu[valor].equals("a")) && (!respUsu[valor].equals("b"))
					&& (!respUsu[valor].equals("c")) && (!respUsu[valor].equals("d")));

			// Validando resposta
			if (respSis[valor].equals(respUsu[valor])) {
				acerto++;
			}else
				erro++;
		}
		JOptionPane.showMessageDialog(null, "Acertos: "+acerto+"\n Erros: "+ erro);
	}

}
