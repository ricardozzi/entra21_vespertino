package exercício07;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {

		// Array
		int[] numeros = new int[5];

		// Random
		Random gerar = new Random();

		// adicionado dados ao vetor
		for (int i = 0; i < 5; i++) {
			numeros[i] = gerar.nextInt(10);
			
			// Blubble Sort - Método da bolha
			int maiornumero;
			for (int i1 = 0; i1 < 5; i1++) {

				for (int i2 = i1 + 1; i2 < 5; i2++) {

					if (numeros[i2] == numeros[i1]) {
						maiornumero = numeros[i1];
						numeros[i1] = numeros[i2];
						numeros[i2] = gerar.nextInt(10);
					}
				}
			}

		}

		// exibir dados
		for (int i = 0; i < 5; i++) {
			System.out.print(numeros[i] + " ");
		}

	}

}
