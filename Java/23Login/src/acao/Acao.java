package acao;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import beans.Login;


public class Acao {
	
	//Arraylist
	public static ArrayList<Login> vetorLogin = new ArrayList<Login>();
	
	String recebeTipo = "";


	// Cadatro
	public boolean cadastrar(Login l) {

		boolean validarLogin = validarLogin(l);

		if (validarLogin == false) {
			vetorLogin.add(l);
			
		}

		return validarLogin;

	}
	//Entrar
	//public boolean entrar(Login l) {
		//boolean validarLogin2 = validarLogin2(l);
		//return validarLogin2;
	//}

	//validar validar se o usu�rio existe
		public boolean validarLogin2(Login l) {
			boolean existe2 = false;
			
			
			//vetorLogin.add(l);
			
			for(int i=0; i<vetorLogin.size(); i++) {

				String nomeLogin  = vetorLogin.get(i).getNome();
				String senhaLogin = vetorLogin.get(i).getSenha();
				
				
				if((nomeLogin.equals(l.getUsu()))&&(senhaLogin.equals(l.getSenha()))) {
					existe2 = true;
				}
				
			}
			System.out.println(l.getUsu());
			System.out.println(l.getSenha());
			System.out.println(l.getTipoUsuario());
			System.out.println(existe2);
			return existe2;
		}
	
	//validar se o nome j� existe
	private boolean validarLogin(Login l) {
		boolean existe = false;
		
		for(int i=0; i<vetorLogin.size(); i++) {

			String nomeLogin = vetorLogin.get(i).getNome();
			
			
			
			if((nomeLogin.equals(l.getNome()))) {
				existe = true;
			}
			
		}
		return existe;
	}
	
	//validar se � Admin ou Simples
		public boolean Admousimples(Login l) {
		boolean existe2 = false;
		// vetorLogin.add(l);

		for (int i = 0; i < vetorLogin.size(); i++) {

			String nomeLogin = vetorLogin.get(i).getNome();
			String senhaLogin = vetorLogin.get(i).getSenha();

			System.out.println(nomeLogin);
			System.out.println(senhaLogin);
			System.out.println(l.getUsu());
			System.out.println(l.getSenha());
			System.out.println(l.getTipoUsuario());

			if ((nomeLogin.equals(l.getUsu())) && (senhaLogin.equals(l.getSenha()))) {
				existe2 = true;
				
			}

		}
		
		System.out.println(existe2);
		return existe2;

			}
			
		
	public void alterar() {

	}

	public void excluir() {

	}

	public void listar() {

	}
	//Selecionar
		public DefaultTableModel selecionar() {
			DefaultTableModel dadosTabela = new DefaultTableModel();
			dadosTabela.addColumn("Nome");
			dadosTabela.addColumn("Tipo de Usu�rio");
			dadosTabela.addColumn("E-mail");
			
			for (int i = 0; i < vetorLogin.size(); i++) {
				dadosTabela.addRow(new Object[] { 
						vetorLogin.get(i).getNome(), 
						vetorLogin.get(i).getTipoUsuario(),
						vetorLogin.get(i).getEmail() });

			}
				
			return dadosTabela;
			}
}
