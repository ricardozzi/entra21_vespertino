package exemplo08;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal {

	public static void main(String[] args) {

		// Criar um formulário
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setTitle("Meu sexto Form!");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Campo
		JTextArea campo = new JTextArea();
		
		// Barra de rolagem
		JScrollPane barraRolagem = new JScrollPane(campo);
		barraRolagem.setBounds(10, 10, 470, 250);
		
		//adicionar ao formulario
		formulario.add(barraRolagem);
		
		// exibir o formulario e seus componetes internos
		formulario.setVisible(true);


	}

}
