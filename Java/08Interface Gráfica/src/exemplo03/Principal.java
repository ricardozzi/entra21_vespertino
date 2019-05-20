package exemplo03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		// Criar um formulário
		JFrame formulario = new JFrame();
		formulario.setSize(500, 180);
		formulario.setTitle("Meu primeiro Form!");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Cria um rótulo
		JLabel rotulo = new JLabel();
		rotulo.setBounds(30,30, 150, 20);
		rotulo.setText("Informe seu nome:");
		
		//criar um campo de texto
		JTextField campo = new JTextField();
		campo.setBounds(140,30,290,20);
		
		//Criar um botão
		JButton botao = new JButton();
		botao.setText("Enviar");
		botao.setBounds(180, 70, 100, 30);
		
		//ação do botão
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//obter o nome informado
				String nome = campo.getText();
				
				//Exibir uma mensagem
				JOptionPane.showMessageDialog(null, "OLá "+ nome);
				
				//Limpar o campo de texto
				campo.setText("");
				
				//Deixar o cursor selecionado no campo
				campo.requestFocus();
			}
		});
		
		//Adicionar elementos ao formulário
		formulario.add(rotulo);
		formulario.add(campo);
		formulario.add(botao);
		
		//exibir o formulari e seus componetes internos
		formulario.setVisible(true);
	}

}
