package exercício06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		//variáveis
		String nome    = "", sistema = "sair", alterar = "", excluir ="", pequisar ="", sair = "", mostra = "";
		int    indice  = 0, dataN = 0, telefone = 0, celular = 0;
		boolean existe = false;
		
		
		//Array
		String[][] dados     = new String [5][8];

		//Inicializando o vetor
		for (int i = 0; i < 5; i++) {
			dados[i][0] =  "";
		}
		
		do{
			while(indice<5) {
				//Variável existe fica com false para que nao fique modificada
				existe = false;
				
				//pede nome
				nome = JOptionPane.showInputDialog("Informe o"+(indice+1)+"º nome: ");
				dados [indice][1] =  JOptionPane.showInputDialog("Informe a data de nascimento: "); 
				dados [indice][2] =  JOptionPane.showInputDialog("Informe o estado: "); 
				dados [indice][3] =  JOptionPane.showInputDialog("Informe a cidade: "); 
				dados [indice][4] =  JOptionPane.showInputDialog("Informe a endereço: "); 
				dados [indice][5] =  JOptionPane.showInputDialog("Informe o telefone: "); 
				dados [indice][6] =  JOptionPane.showInputDialog("Informe o celular: "); 
				dados [indice][7] =  JOptionPane.showInputDialog("Informe o e-mail: ");
				
				//verifica se o nome já existe
				for (int i = 0; i < 5; i++) {
					if (dados[i][0].equals(nome)) {
						existe = true;
					}
					
				}
				//condiciona
				if (existe== false) {
					dados [indice][0] = nome;
					indice++;
				}
			}
			 
			alterar = JOptionPane.showInputDialog("Deseja alterar um contato? Digite sim ou não:");
			if (alterar.equals("sim")) {
				
				//pede nome
				nome = JOptionPane.showInputDialog("Informe o nome que deseja alterar: ");
				
				//verifica se o nome já existe
				for (int i = 0; i < 5; i++) {
					if (dados[i][0].equals(nome)) {
						dados [i][0] =  JOptionPane.showInputDialog("Informe o novo noome: ");
						dados [i][1] =  JOptionPane.showInputDialog("Informe a data de nascimento: "); 
						dados [i][2] =  JOptionPane.showInputDialog("Informe o estado: "); 
						dados [i][3] =  JOptionPane.showInputDialog("Informe a cidade: "); 
						dados [i][4] =  JOptionPane.showInputDialog("Informe a endereço: "); 
						dados [i][5] =  JOptionPane.showInputDialog("Informe o telefone: "); 
						dados [i][6] =  JOptionPane.showInputDialog("Informe o celular: "); 
						dados [i][7] =  JOptionPane.showInputDialog("Informe o e-mail: ");

					}else
						JOptionPane.showMessageDialog(null, "Não encontramos nenhum "+nome);
				}
				
			}
			excluir = JOptionPane.showInputDialog("Deseja excluir um contato? Digite sim ou não:");
			if (excluir.equals("sim")) {

				//pede nome
				nome = JOptionPane.showInputDialog("Informe o nome que deve ser excluido alterar: ");
				
				//verifica se o nome já existe
				for (int i = 0; i < 5; i++) {
					if (dados[i][0].equals(nome)) {
						dados [i][0] = "";
						dados [i][1] = "";
						dados [i][2] = "";
						dados [i][3] = "";
						dados [i][4] = "";
						dados [i][5] = "";
						dados [i][6] = "";
						dados [i][7] = "";

					}else
						JOptionPane.showMessageDialog(null, "Não encontramos nenhum "+nome);
				}
				
			}
			pequisar = JOptionPane.showInputDialog("Deseja pequisar um contato? Digite sim ou não:");
			if (pequisar.equals("sim")) {
				
				//pede nome
				nome = JOptionPane.showInputDialog("Informe o nome que deseja pesquisar: ");
				
				//verifica se o nome já existe
				for (int i = 0; i < 5; i++) {
					if (dados[i][0].equals(nome)) {
						mostra+="\n"+ dados [i][0] ;
						mostra+="\n"+ dados [i][1] ;
						mostra+="\n"+ dados [i][2] ;
						mostra+="\n"+ dados [i][3] ;
						mostra+="\n"+ dados [i][4] ;
						mostra+="\n"+ dados [i][5] ;
						mostra+="\n"+ dados [i][6] ;
						mostra+="\n"+ dados [i][7] ;
						JOptionPane.showMessageDialog(null, mostra);
						
					}else
						JOptionPane.showMessageDialog(null, "Não encontramos nenhum "+nome);
				}		
				
			}
			
			
			
			sistema = JOptionPane.showInputDialog("digite 'sair' para finalizar a agenda ou 'continuar' para continuar a usar:");
		}while(!sistema.equals("sair"));

	}
	

}
