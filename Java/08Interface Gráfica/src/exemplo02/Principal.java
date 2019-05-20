package exemplo02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Criar um formul�rio
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setTitle("Meu primeiro Form!");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setVisible(true);

		//bot�o
		JButton botao = new JButton();
		botao.setText("Enviar");
		//botao.setSize(100, 30);
		botao.setBounds(195, 100, 100, 30);
		
		//a�ao no bot�o
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hello World!");
				
			}
		});
		
		//Adicionar bot�o no forml�rio
		formulario.add(botao);
	}

}
