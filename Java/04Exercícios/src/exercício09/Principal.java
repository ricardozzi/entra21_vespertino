package exerc�cio09;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo  n�mero:"));
		int contadorneg = 0, contadorposi = 0, contadorpar = 0, contadorimpar = 0, recebe = 0;
		String mostra = "";
		
		
		
			if (numero1 < numero2) {
				for(int i=numero1; i <= numero2; i++) {
					
				recebe =( i % 2 == 0 ? (contadorpar++) : (contadorimpar++));
				
				if (numero2 < 0) {
					contadorneg++;
				}else {
					contadorposi++;
					JOptionPane.showMessageDialog(null, i);
				}}
				
			}else {
					for(int i=numero1; i >= numero2; i--) {
						
					
					recebe = (i% 2 == 0 ? (contadorpar++) : (contadorimpar++));
					
					if (numero1 < 0) {
						contadorneg++;
					}else
						contadorposi++;
					JOptionPane.showMessageDialog(null, i);
					
					}
			}

			JOptionPane.showMessageDialog(null, mostra);
			mostra+="\n"+numero2--;
			
		
		if (numero1>numero2) {
			
			mostra+="\n quantidade de n�meros negativos: "+contadorneg;
			mostra+="\n quantidade de n�meros positivos: "+contadorposi;
			mostra+="\n quantidade de n�meros pares: "+contadorpar;
			mostra+="\n quantidade de n�meros �mpares: "+ contadorimpar;
		JOptionPane.showMessageDialog(null, mostra);
		}else {
		
			
			mostra+="\n quantidade de n�meros negativos: "+contadorneg;
			mostra+="\n quantidade de n�meros positivos: "+contadorposi;
			mostra+="\n quantidade de n�meros pares: "+contadorpar;
			mostra+="\n quantidade de n�meros �mpares: "+ contadorimpar;
		JOptionPane.showMessageDialog(null, mostra);}
	}

}
