package exercício05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//variaveis
		String mostra ="";
		int total = 0, soma = 0, media = 0, igualmedia = 0, negativo = 0, nulo = 0, positivo = 0, maiornumero = 0, menornumero = 0
				, par = 0, impar = 0;
		
		//array
		int[] numeros  = new int [15];
		
		//pedindo os números e somando
		for (int i = 0; i < 15; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("informe o "+(i+1)+"º números:"));
			soma+= (numeros[i]);
		}
		//fazendo a média
		media+= soma / 15;
		
		//verificando...
		for (int i = 0; i < numeros.length; i++) {
			
			// maior igual a media
			if (numeros[i]>= media) {
				igualmedia++;}
			
			//numeros positivos, negativos e nulos
			if (numeros[i] == 0) {
				nulo++;}
			
			if (numeros[i] < 0) {
				negativo++;
	
			}else {
				positivo++;}
			
			//numeros pares ou impares
			if (numeros[i] % 2 == 0 ) {
				par++ ;
			}else {
				impar++;
			}
		}
		
		// Blubble Sort - Método da bolha

		for (int i1 = 0; i1 < 14; i1++) {

			for (int i2 = i1 + 1; i2 < 15; i2++) {

				if (numeros[i2] > numeros[i1]) {
					maiornumero = numeros[i1];
					numeros[i1] = numeros[i2];
					numeros[i2] = maiornumero;
					menornumero = numeros[14];
				}

				
			}
		}

		for (int i = 0; i < 1; i++) {
			maiornumero = numeros[i];
			}

		mostra+="\n"+soma+" - Soma";
		mostra+="\n"+media+" - Media";
		mostra+="\n"+negativo+" - Negativo";
		mostra+="\n"+positivo+" - Positivo";
		mostra+="\n"+nulo+" - Nulo";
		mostra+="\n"+par+" - Ímpar";
		mostra+="\n"+impar+" - Par";
		mostra+="\n"+maiornumero+"- maiornumero";
		mostra+="\n"+menornumero+" - Menor número";
		
		JOptionPane.showMessageDialog(null, mostra);
	}

}
