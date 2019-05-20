package principal;

import java.awt.EventQueue;

import acao.Acao;
import beans.Login;
import formulario.Formulario;
import formulario.Formulario02;

public class Principal {
	public static void main(String[] args) {
		
		
		
		Login l = new Login();
		l.setNome("Admin");
		l.setSenha("Admin");
		l.setTipoUsuario("Administrador");
		l.setEmail("Admin@gmail.com");
		Acao.vetorLogin.add(l);
		//System.out.println(Acao.vetorLogin.get(0).getNome());

		
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Formulario frame = new Formulario();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			});
		
	

	
	}
}
