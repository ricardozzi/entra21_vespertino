package exemplo03;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
	
		//Vetor 
		String[] nomes = new String [20];
		int   [] idade = new int [20];
		
		//Continuar
		int continuar = 0;
		
		// 
		int indice = 0 ;
		
		//La�o
		do {
			
			//Perguntar nome e idade
			nomes[indice] = JOptionPane.showInputDialog("informe seu nome");
			idade[indice]= Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
			
			//Incrementar
			indice++;
			
			//Verifica se quer continuar
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		} while (continuar == 0);
		
		//Estrutura de exibi��o
		
		String exibir = "Usu�rios cadastrados";
		
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i] != null) {
				exibir+= "\nNome: "+nomes[i];
				exibir+= "\nidade: "+idade[i];
				exibir+= "\n";
				
			}
		}
		JOptionPane.showMessageDialog(null, exibir);

	}
}
