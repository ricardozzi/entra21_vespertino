package exercício01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Object[] sexos = {"Masculino","Femenino"};
		Object[] cargos = {"Gerete","Atendente","Açogueiro","Secretário","Almoxarife","Padeiro","Estagiário"};
		
		
		int    sexo, cargo, continuar = 0;
		int femenino =0,masculino=0;
		int gerente=0, atendente=0, acogueiro=0, secretario=0, almoxarife=0, padeiro=0, estagiario =0, idade1=0, idade2 = 0;
		
		
		
		do {
			
			String nome  = JOptionPane.showInputDialog("Informe seu nome: ");
			int    idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
			
			if (idade >= 18) {
				idade1 = idade1 + 1;
			}else
				idade2 = idade2 + 1;
			
			//Selecionar os sexos
			sexo = JOptionPane.showOptionDialog(null,"Informe o sexo:","",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,sexos,0);
			
			//Contabilizar os sexos
			switch(sexo) {
			case 0:
				femenino++;
			break;
			case 1:
				masculino++;
			break;
			}
			
			cargo = JOptionPane.showOptionDialog(null,"Informe o cargo:","",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,cargos,0);
			
			//Contabilizar os sexos
			switch(cargo) {
			case 0:
				gerente++;
			break;
			case 1:
				atendente++;
			break;
			case 2:
				acogueiro++;
			break;
			case 3:
				secretario++;
			break;
			case 4:
				almoxarife++;
			break;
			case 5:
				padeiro++;
			break;
			case 6:
				estagiario++;
			break;
			}
			
			
			
			//verificar se deseja continuar
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
		}while(continuar ==0);
		
		//Exibir o resultado
		
		String resultado ="Informações dos cadastrados:";
		       resultado+="\nPessoas de sexo femenino: "+femenino;
			   resultado+="\nPessoas de sexo masculino: "+masculino;
			   resultado+="\nPessoas para gerente: "+gerente;
			   resultado+="\nPessoas para atendente: "+atendente;
			   resultado+="\nPessoas para açogueiro: "+acogueiro;
			   resultado+="\nPessoas para secretário: "+secretario;
			   resultado+="\nPessoas para lmoxarife: "+almoxarife;
			   resultado+="\nPessoas para padeiro: "+padeiro;
			   resultado+="\nPessoas para estagiário: "+estagiario;
			   resultado+="\nPessoas maiores de 18 anos: "+idade1;
			   resultado+="\nPessoas menores de 18 anos: "+idade2;
			   
	
			   JOptionPane.showMessageDialog(null, resultado);

	}

}
