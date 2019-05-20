package exercício01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Object[] operacoes = {"Soma","Subtração","Divisão","Multiplicação"};
		
		//variaveis
		int operacao = 0, total1 = 0,total2 = 0,total3 = 0,total4 = 0,total5 = 0,total6 = 0,total7 = 0,total8 = 0,total9 = 0,total10 = 0;
		String mostra = "";
		
		//Pedido de operação
		operacao = JOptionPane.showOptionDialog(null, "Informe a operação desejada: ", "Operações",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null, operacoes, 0);
		
		//Array
		int[][] numeros = new int [10][2];
		
		//Laço
		for (int i = 0; i < 10; i++) {
			numeros[i][0] = Integer.parseInt(JOptionPane.showInputDialog("informe o números para posiçao: "+i+" "+0));
			numeros[i][1] = Integer.parseInt(JOptionPane.showInputDialog("informe o números para posiçao: "+i+" "+1));
			
		
		}
		
		
		switch (operacao) {
		case 0:
			total1+= (numeros[0][0]) + (numeros[0][1]);
			total2+= (numeros[1][0]) + (numeros[1][1]);
			total3+= (numeros[2][0]) + (numeros[2][1]);
			total4+= (numeros[3][0]) + (numeros[3][1]);
			total5+= (numeros[4][0]) + (numeros[4][1]);
			total6+= (numeros[5][0]) + (numeros[5][1]);
			total7+= (numeros[6][0]) + (numeros[6][1]);
			total8+= (numeros[7][0]) + (numeros[7][1]);
			total9+= (numeros[8][0]) + (numeros[8][1]);
			total10+= (numeros[9][0]) + (numeros[9][1]);
		break;
		case 1:
			total1+= (numeros[0][0]) + (numeros[0][1]);
			total2+= (numeros[1][0]) + (numeros[1][1]);
			total3+= (numeros[2][0]) + (numeros[2][1]);
			total4+= (numeros[3][0]) + (numeros[3][1]);
			total5+= (numeros[4][0]) + (numeros[4][1]);
			total6+= (numeros[5][0]) + (numeros[5][1]);
			total7+= (numeros[6][0]) + (numeros[6][1]);
			total8+= (numeros[7][0]) + (numeros[7][1]);
			total9+= (numeros[8][0]) + (numeros[8][1]);
			total10+= (numeros[9][0]) + (numeros[9][1]);
		break;
		case 2:
			total1+= (numeros[0][0]) + (numeros[0][1]);
			total2+= (numeros[1][0]) + (numeros[1][1]);
			total3+= (numeros[2][0]) + (numeros[2][1]);
			total4+= (numeros[3][0]) + (numeros[3][1]);
			total5+= (numeros[4][0]) + (numeros[4][1]);
			total6+= (numeros[5][0]) + (numeros[5][1]);
			total7+= (numeros[6][0]) + (numeros[6][1]);
			total8+= (numeros[7][0]) + (numeros[7][1]);
			total9+= (numeros[8][0]) + (numeros[8][1]);
			total10+= (numeros[9][0]) + (numeros[9][1]);
		break;
		case 3:
			total1+= (numeros[0][0]) + (numeros[0][1]);
			total2+= (numeros[1][0]) + (numeros[1][1]);
			total3+= (numeros[2][0]) + (numeros[2][1]);
			total4+= (numeros[3][0]) + (numeros[3][1]);
			total5+= (numeros[4][0]) + (numeros[4][1]);
			total6+= (numeros[5][0]) + (numeros[5][1]);
			total7+= (numeros[6][0]) + (numeros[6][1]);
			total8+= (numeros[7][0]) + (numeros[7][1]);
			total9+= (numeros[8][0]) + (numeros[8][1]);
			total10+= (numeros[9][0]) + (numeros[9][1]);
		break;}

		mostra+="\n total = "+total1;
		mostra+="\n total = "+total2;
		mostra+="\n total = "+total3;
		mostra+="\n total = "+total4;
		mostra+="\n total = "+total5;
		mostra+="\n total = "+total6;
		mostra+="\n total = "+total7;
		mostra+="\n total = "+total8;
		mostra+="\n total = "+total9;
		mostra+="\n total = "+total10;
		JOptionPane.showMessageDialog(null, mostra);
		
		

	}

}
