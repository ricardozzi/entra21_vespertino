package exerc�cio08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// Vari�veis
		int soma = 0, igualmedia = 0, media = 0, nulo = 0, negativo = 0, positivo = 0, par = 0, impar = 0,
				maiormedia = 0;
		String mostra = "";

		// Array
		int[][] numeros = new int[5][6];

		// pedindo n�meros
		for (int i2 = 0; i2 < 5; i2++) {
			for (int i = 0; i < 6; i++) {
				numeros[i2][i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero:" + (i + 1)));
				soma += (numeros[i2][i]);

			}
		}
		
		media = soma/30;

		// verificando...
		for (int i1 = 0; i1 < 5; i1++) {

			for (int i2 = 0; i2 < 6; i2++) {

				// maior igual a media
				if ((numeros[i1][i2] > media) || (numeros[i1][i2] > media) || (numeros[i1][i2] > media)
						|| (numeros[i1][i2] > media) || (numeros[i1][i2] > media) || (numeros[i1][i2] > media)) {
					igualmedia++;
				}

				if ((numeros[i1][i2] == media) || (numeros[i1][i2] == media) || (numeros[i1][i2] == media)
						|| (numeros[i1][i2] == media) || (numeros[i1][i2] == media) || (numeros[i1][i2] == media)) {
					maiormedia++;
				}

				// numeros pares ou impares
				if ((numeros[i1][i2] % 2 == 0) || (numeros[i1][i2] % 2 == 0) || (numeros[i1][i2] % 2 == 0)
						|| (numeros[i1][i2] % 2 == 0) || (numeros[i1][i2] % 2 == 0) || (numeros[i1][i2] % 2 == 0)) {
					par++;
				} else {
					impar++;
				}
			}

		}

		// Exibir dados
		mostra += "\n n�meros pares" + par;
		mostra += "\n n�meros �mpares" + impar;
		mostra += "\n n�meros m�dia" + media;
		mostra += "\n n�meros igual a m�dia" + maiormedia;
		mostra += "\n n�meros maior m�dia" + igualmedia;
		// Exibir estrutura de linhas e colunas
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				JOptionPane.showMessageDialog(null, numeros[linha][coluna] + " ");
				JOptionPane.showMessageDialog(null, mostra + " ");
			}

		}

	}

}
