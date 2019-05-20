package exemplo01;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um formulário
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setTitle("Meu primeiro Form!");
		formulario.setLocationRelativeTo(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setVisible(true);

	}

}